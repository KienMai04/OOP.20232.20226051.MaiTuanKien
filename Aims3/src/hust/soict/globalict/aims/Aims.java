package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart cart = new Cart();

        // Tạo một số DVD và thêm chúng vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "John Favreau", 118, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 150, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Guy Ritchie", 128, 18.99f);
        cart.addMedia(dvd3);

        // Hiển thị giỏ hàng trước khi loại bỏ bất kỳ mặt hàng nào
        System.out.println("Giỏ hàng trước khi loại bỏ:");
		cart.printCart(cart);
        System.out.println("Tổng chi phí: " + cart.totalCost());

        // Loại bỏ một DVD khỏi giỏ hàng
        cart.removeMedia(dvd2);

        // Hiển thị giỏ hàng sau khi loại bỏ
        System.out.println("\nGiỏ hàng sau khi loại bỏ:");
		cart.printCart(cart);
        System.out.println("Tổng chi phí: " + cart.totalCost());
    }
}





