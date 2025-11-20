package Interoperability;

import javax.xml.crypto.Data;

public class CallKotlinCodeFromJava {
    public static void main(String[] args) {
        System.out.println("Hello From Java");

//        TYPE_DATA NAMA_VARIABLE = NEW_NAMA_CLASS;
                CounterExampleKotlin counter1 = new CounterExampleKotlin();

                System.out.println(counter1.getNumber());
                counter1.increment();
                System.out.println(counter1.getNumber());

                System.out.println(StringUtilsKt.isEmail("test@mail.com"));

                Logger logger = new Logger();
                logger.log("Aplikasi dimulai");

                String dbUrl = Database.Companion.getConnectionUrl();
                String dbUrl1 = Database.getConnectionUrl();
                System.out.println(dbUrl);

    }
}
