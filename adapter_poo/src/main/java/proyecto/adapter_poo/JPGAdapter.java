/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.adapter_poo;

/**
 *
 * @author pedro
 */
public class JPGAdapter implements Image {
    private JPGImage jpgImage;

    public JPGAdapter(JPGImage jpgImage) {
        this.jpgImage = jpgImage;
    }

    @Override
    public void display() {
        jpgImage.render();
    }
    
}
