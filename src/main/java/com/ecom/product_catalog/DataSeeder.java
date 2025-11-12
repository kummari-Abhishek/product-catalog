package com.ecom.product_catalog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecom.product_catalog.model.Category;
import com.ecom.product_catalog.model.Product;
import com.ecom.product_catalog.repository.CategoryRepository;
import com.ecom.product_catalog.repository.ProductRepository;
@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private ProductRepository productRepo;

    @Override
    public void run(String... args) {
    	   // Define categories
        Category clothing = new Category();
        clothing.setName("Clothing");
        categoryRepo.save(clothing);

        Category laptops = new Category();
        laptops.setName("Laptops");
        categoryRepo.save(laptops);

        Category electronics = new Category();
        electronics.setName("Electronics");
        categoryRepo.save(electronics);

        Category books = new Category();
        books.setName("Books");
        categoryRepo.save(books);

        Category smartphones = new Category();
        smartphones.setName("Smartphones");
        categoryRepo.save(smartphones);

        Category accessories = new Category();
        accessories.setName("Accessories");
        categoryRepo.save(accessories);

        List<Product> products = new ArrayList<>();

        // Clothing (1-7)
        products.add(new Product("Cotton Shirt", "Blue comfort fit shirt", 500.0, "https://th.bing.com/th/id/OIP.Ws67EKmoTZxxPkFpSn8ejAHaJQ?w=186&h=233&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Jeans", "Denim regular fit", 1200.0, "https://th.bing.com/th/id/OIP.X333HRomj_l2v8CMaAaa4wHaLH?w=186&h=279&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Leather Jacket", "Brown biker jacket", 3500.0, "https://th.bing.com/th/id/OIP.v0cNNPPk3PIAjHeMzASPzQHaLH?w=186&h=279&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Sports Shorts", "Running shorts black", 350.0, "https://th.bing.com/th/id/OIP.DrhLPjwPajsaseOxYjRzfwHaHa?w=186&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Socks", "Pack of 5", 150.0, "https://th.bing.com/th/id/OIP.Hh8G2AI8CKsT1VnAZ2cFSgHaHa?w=203&h=203&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Formal Pants", "Grey slim fit", 950.0, "https://th.bing.com/th/id/OIP.C74CXGwt4ZZXwuqQkKYQEwAAAA?w=186&h=280&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));
        products.add(new Product("Sweatshirt", "Oversized orange", 700.0, "https://th.bing.com/th/id/OIP.b74sFr887h545arxiIq7hwHaEJ?w=282&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", clothing));

        // Laptops (8-14)
        products.add(new Product("Dell Inspiron", "15.6'' i5, 8GB RAM", 45000.0, "https://th.bing.com/th/id/OIP.XemMK-rR1oxiUAMJpSSa6AHaHa?w=200&h=199&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("HP Pavilion", "14'' Ryzen 7, 16GB RAM", 58000.0, "https://th.bing.com/th/id/OIP.4SyeQHbgt2isSbZIurLnSAHaF7?w=234&h=187&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("Apple MacBook Air", "13'' M2 chip", 93000.0, "https://th.bing.com/th/id/OIP.h_Q_LdGYmOiRE83VEFqa2AHaE7?w=241&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("Lenovo ThinkPad", "14'' Business laptop", 67000.0, "https://th.bing.com/th/id/OIP.Yz-MIIlBNWvbkqbWch3VMwHaHa?w=203&h=203&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("ASUS Vivobook", "Gaming series RTX 3050", 75000.0, "https://th.bing.com/th/id/OIP.lb1qvgUMMCEZUlqDhC31mQHaFD?w=274&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("Acer Aspire", "Entry-level 4GB RAM", 38000.0, "https://th.bing.com/th/id/OIP.u2tXhH53Nz_Gl5uG3-si4wHaFW?w=228&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));
        products.add(new Product("MS Surface Pro", "2-in-1 touch, 8GB RAM", 84000.0, "https://th.bing.com/th/id/OIP.GiBMnc_7OZdftIWWx33hFgHaFr?w=206&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", laptops));

        // Electronics (15-20)
        products.add(new Product("Bluetooth Speaker", "JBL portable speaker", 2500.0, "https://th.bing.com/th/id/OIP.ftrtUOQ8TnwTyUdF_BD6hQHaFU?w=209&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));
        products.add(new Product("Smart TV", "Samsung 43'' UHD", 37000.0, "https://th.bing.com/th/id/OIP.TStDyiVroS8H6MUNZGjJYgHaHa?w=188&h=188&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));
        products.add(new Product("Headphones", "Sony WH-1000XM4", 22000.0, "https://th.bing.com/th/id/OIP.qMnKupYMJvmaLZEtlxuF6AHaHa?w=185&h=185&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));
        products.add(new Product("Fitness Band", "Mi Smart Band 7", 2200.0, "https://th.bing.com/th/id/OIP.WhM413yuALbuLB0sxW3iMgHaHa?w=197&h=197&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));
        products.add(new Product("Home Security Camera", "TP-Link WiFi Cam", 3000.0, "https://th.bing.com/th/id/OIP.1Zzeh9so9SUsjsVev-M1nAHaEc?w=242&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));
        products.add(new Product("Power Bank", "10000mAh portable", 950.0, "https://th.bing.com/th/id/OIP.ruQhFiJ416J_5TcO673eKgHaE8?w=283&h=189&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", electronics));

        // Books (21-27)
        products.add(new Product("Atomic Habits", "James Clear", 450.0, "https://th.bing.com/th/id/OIP.bAR_NUW86Wv_xCd973ljAwHaFj?w=245&h=184&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("The Almanack of Naval Ravikant", "Eric Jorgenson", 500.0, "https://th.bing.com/th/id/OIP.JuXmEFtzTH4Pbd9Cwx-hzAAAAA?w=246&h=188&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("Clean Code", "Robert C. Martin", 650.0, "https://th.bing.com/th/id/OIP.UWnG79S_gfE_JYWvbhV_zQHaFj?w=239&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("Harry Potter", "J. K. Rowling (Box Set)", 2400.0, "https://th.bing.com/th/id/OIP.0Y86uurnh2aTIHwpJ9Xn8gHaF7?w=234&h=187&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("Rich Dad Poor Dad", "Robert Kiyosaki", 350.0, "https://th.bing.com/th/id/OIP.U7BRtdUJU-F_EoPmUzTlEgHaE7?w=259&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("Deep Work", "Cal Newport", 420.0, "https://th.bing.com/th/id/OIP.53chXTpEpGoQhI9oeA21zwHaEc?w=251&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));
        products.add(new Product("Introduction to Algorithms", "Cormen et al", 900.0, "https://th.bing.com/th/id/OIP.RxDwFBk-WTd8X8fBpvgsvwHaFj?w=284&h=213&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", books));

        // Smartphones (28-33)
        products.add(new Product("iPhone 15", "Apple 128GB", 80000.0, "https://th.bing.com/th/id/OIP.6SQd9myNJNTPQKD86eUvHQHaE7?w=280&h=187&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));
        products.add(new Product("Samsung Galaxy S23", "Flagship 8GB RAM", 72000.0, "https://th.bing.com/th/id/OIP.pQPr9keMfz1JXAMfpdDIzgHaGR?w=229&h=194&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));
        products.add(new Product("OnePlus 12", "12GB RAM 256GB", 55000.0, "https://th.bing.com/th/id/OIP.F07nCHRyKac9PlIS6mcHvAHaHa?w=178&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));
        products.add(new Product("Realme X9", "Budget 4GB RAM", 15000.0, "https://th.bing.com/th/id/OIP.NoG7-UrBOya8Osb43LEEEgHaHa?w=185&h=185&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));
        products.add(new Product("Google Pixel 8", "8GB RAM, 128GB", 65000.0, "https://th.bing.com/th/id/OIP.oDxt9YiXsc6O-iHA8kYxXwHaHa?w=197&h=197&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));
        products.add(new Product("Xiaomi Redmi Note 13", "6GB RAM, 128GB", 18000.0, "https://th.bing.com/th/id/OIP.r5QTItiEohGA1rEwAXC_XAHaHa?w=183&h=183&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", smartphones));

        // Accessories (34-40)
        products.add(new Product("Backpack", "Laptop bag, waterproof", 1200.0, "https://th.bing.com/th/id/OIP.wM2pQq-PFStoNxgIXRcCCAHaLH?w=130&h=195&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Smartwatch Strap", "Silicone, black", 350.0, "https://th.bing.com/th/id/OIP.Rnh5-MBLWWpELMBL3CmXBQHaJ6?w=146&h=195&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Phone Case", "Shockproof for S23", 450.0, "https://th.bing.com/th/id/OIP.gQlj8V41kgbopO3KqfuVHQHaHa?w=221&h=220&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Desk Lamp", "USB LED lamp", 600.0, "https://th.bing.com/th/id/OIP.lg2g5tgGVfRIgke4lOl1VwHaHa?w=163&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Mouse Pad", "Large XL", 380.0, "https://th.bing.com/th/id/OIP.nl9ccl_GXkLTBn-F8JQbtQHaE8?w=306&h=204&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Wireless Mouse", "Logitech silent", 990.0, "https://th.bing.com/th/id/OIP.A1_rJUu_wuxR7c14HOyT5wHaEK?w=333&h=187&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));
        products.add(new Product("Charger", "18W fast charge", 700.0, "https://th.bing.com/th/id/OIP.h1STgbiuaQZsbOGMkPhM3QHaG1?w=196&h=181&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3", accessories));

        productRepo.saveAll(products);
    }
    

}
