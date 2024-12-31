package DevDojo.poo.resourceBundletest;

import DevDojo.poo.datas.local.Local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {


    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mass", new Locale("pt","BR"));
        System.out.println(bundle.getString("hello"));


        bundle = ResourceBundle.getBundle("mass", new Locale("en","US"));
        System.out.println(bundle.getString("hello"));


    }
}
