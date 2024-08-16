package com.example.viewpager2andtablayout;

import java.util.ArrayList;

public class Utils {
    static ArrayList<Product> products=new ArrayList<>();
    static ArrayList<String> categories =new ArrayList<>();

    public static void FillCategoryData(){//Cat1,Cat2,Cat3,Cat4,Cat5
            categories.add("Food");
            categories.add("Drink");
            categories.add("Fast Food");
            categories.add("Ice Cream");
            categories.add("Deserts");

    }

    public static void FillProductData(){//Cat1,Cat2,Cat3,Cat4,Cat5
      for(int i=0;i<50;i++){
          products.add(new Product(i+1,"Product #"+i,R.drawable.baseline_mood_24,i*2+5.5,categories.get(i%5)));
      }

    }

    public static void FillData(){
        FillCategoryData();
        FillProductData();


    }

    public static ArrayList<Product> getProductsByCategory(String category){
        ArrayList<Product> products1=new ArrayList<>();
        for (int i=0;i<products.size();i++){
            if(category.equals(products.get(i).getCategory())){
                products1.add(products.get(i));
            }
        }
        return products1;
    }



}
