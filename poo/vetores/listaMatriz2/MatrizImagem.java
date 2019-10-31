import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class MatrizImagem {

	public static int getColor(int r, int b, int g) {
		return new Color(r % 255, g % 255, b % 255).getRGB();
	}

	public static int[] getRGBValuesFromInt(int rgb) {
		int red = (rgb >> 16) & 0xFF;
		int green = (rgb >> 8) & 0xFF;
		int blue = rgb & 0xFF;
		int[] v = new int[3];
		v[0] = red;
		v[1] = green;
		v[2] = blue;
		return v;
	}

	public static int [][] transposta(int [][] img){
		int [][] trans = new int [img[0].length][img.length];

		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				trans[j][i] = img[i][j];
			}
		}
		return trans;

	}

	public static int [][] soma(int [][] img, int [][] img2){
		int [][] imgSoma = new int [img.length][img[0].length];

		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				imgSoma[i][j] = img[i][j] + img2[i][j] ;
			}
		}
		return imgSoma;

	}

	public static int [][] subtracao(int [][] img, int [][] img2){
		int [][] imgSubtracao = new int [img.length][img[0].length];

		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				imgSubtracao[i][j] = img[i][j] - img2[i][j] ;
			}
		}
		return imgSubtracao;

	}

	public static int [][] multiplicaEscalar(int [][] img, int real){
		int [][] multiplica = new int [img.length][img[0].length];

		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				multiplica[i][j] = img[i][j] * real ;
			}
		}
		return multiplica;

	}

	public static int getRGBfromarray(int[] v) {

		int rgb = v[0];
		rgb = (rgb << 8) + v[1];
		rgb = (rgb << 8) + v[2];
		return rgb;
	}

	public static int[][] returnImgMatrix(String name) {
		try {
			BufferedImage imagem;
			imagem = ImageIO.read(new File(name));
			int w = imagem.getWidth();
			int h = imagem.getHeight();
			int[] pixels = imagem.getRGB(0, 0, w, h, null, 0, w);
			int[][] mPixels = new int[w][h];

			for (int col = 0; col < w; col++)
				for (int lin = 0; lin < h; lin++)
					mPixels[col][lin] = pixels[w * lin + col];

			return mPixels;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void saveImg(int m[][], String name) {
		try {
			BufferedImage image = new BufferedImage(m.length, m[0].length, TYPE_INT_RGB);
			int w = m.length;
			int h = m[0].length;
			int[] pixels = new int[w * h];
			for (int col = 0; col < w; col++)
				for (int lin = 0; lin < h; lin++)
					pixels[w * lin + col] = m[col][lin];

			image.setRGB(0, 0, w, h, pixels, 0, w);
			ImageIO.write(image, "PNG", new File(name));
		} catch (Exception e) {

		}
	}
}