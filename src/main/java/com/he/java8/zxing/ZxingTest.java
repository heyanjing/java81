package com.he.java8.zxing;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

/**
 * Created by heyanjing on 2017/5/22 11:28.
 */
public class ZxingTest {
    public static void main(String[] args) {

        try {
            File file = new File("D:/2.png");
            //生成
            HashMap<EncodeHintType, Object> encodeHints = Maps.newHashMap();
            encodeHints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            encodeHints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            encodeHints.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrix = new MultiFormatWriter().encode("编码内容", BarcodeFormat.QR_CODE, 300, 300, encodeHints);
            MatrixToImageWriter.writeToPath(bitMatrix, "png", file.toPath());

            //解析
            HashMap<DecodeHintType, Object> decodeHints = Maps.newHashMap();
            decodeHints.put(DecodeHintType.CHARACTER_SET, "utf-8");
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            BufferedImage image = ImageIO.read(file);
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
            Result result = multiFormatReader.decode(binaryBitmap, decodeHints);
            System.err.println(JSON.toJSONString(result));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
