import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQrCode {
    public static void main(String[] args) throws WriterException, IOException {
        String data = "https://www.youtube.com/channel/UCORFFsKq5v6y-EoiyC1vZqQ"; //Your link
        String path = "D:\\My projects\\path\\feedhub.jpg"; //path to generate Qrcode

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix,"jpg", Paths.get(path));

        System.out.println("Qr code successfully created");
    }
}
