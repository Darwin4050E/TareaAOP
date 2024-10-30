/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.adapter_poo;

/**
 *
 * @author pedro
 */
public class Adapter_poo {

    public static void main(String[] args) {
        Image pngImage = new PNGImage();
        pngImage.display();
        
        JPGImage jpgImage = new JPGImage();
        Image jpgAdapter = new JPGAdapter(jpgImage);
        jpgAdapter.display();
    }
}
