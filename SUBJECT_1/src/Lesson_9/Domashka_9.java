package Lesson_9;

import java.sql.SQLOutput;

public class Domashka_9 {
public static void main(String[] args) {
    //нужно выучить методы String
    char[] symvoly = {'П', 'р', 'и', 'в', 'е', 'т'};
    String slovo = new String(symvoly);
    System.out.println(slovo);

    String a1 = "Symbat Ashirbekova";
    String a2 = "Symbat Ashirbekova";
    String c = "Nurzhanovna";
    int b = a1.length();
    System.out.println(a1.concat(c));
    char result1 = a1.charAt(14);
    System.out.println(result1);
    int result2 = a1.compareTo(a2);
    int result3 = c.compareTo(a1); //аргумент меньше чем сравнение, поэтому -
    int result4 = a1.compareTo(c); //аргумент больше чем сравнение, поэтому +
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    String f = a1.concat(a2);
    System.out.println(f);

    String str1 = "Турар Рыскулов мектеби";
    String str8 = "Турар Рыскулов мектеби";
    String str2 = "Рыскулов мектеби";
    StringBuffer str3 = new StringBuffer("Турар Рыскулов мектеби");
    String str7 = str1;
    boolean prov1 = str1.contentEquals(str3);
    boolean prov2 = str2.contentEquals(str3);
    System.out.println(prov1);
    System.out.println(prov2);

    char[] str5 = {'м', 'е', 'к', 'т', 'е', 'п'};
    String str6 = "";
    str6 = str6.copyValueOf(str5, 2, 3);
    System.out.println(str6);

    boolean prov3 = str1.endsWith(str2);
    System.out.println(prov3);

    boolean prov4 = str1.equals(str7);
    System.out.println("equals " + prov4);

    boolean prov5 = str1.equalsIgnoreCase(str8);
    System.out.println("equalsIgnoreCase " + prov5);


/*
        String Str100 = new String("Добро пожаловать на ProgLang.su");
            byte[] Str200 = Str100.getBytes();
            System.out.println("Возвращаемое значение: " + Str200);
            Str200 = Str100.getBytes("UTF-8");
            System.out.println("Возвращаемое значение: " + Str200);
     */

    String cca = "Symbat Kentau";
    char[] ar2 = new char[4];
    cca.getChars(1, 5, ar2, 0);
    System.out.println(ar2);
    System.out.println(cca.hashCode());

    String kv1 = "Kazakhstanstan";
    String kv2 = "stan";
    System.out.println("Indexof " + kv1.indexOf('a', 5));
    System.out.println("Indexof Stroka " + kv1.indexOf(kv2));
    System.out.println("Indexof Stroka " + kv1.indexOf(kv2, 7));
    System.out.println(kv1.intern());
    System.out.println("Last Index Of: " + kv1.lastIndexOf('a'));
    System.out.println("Last Index Of: " + kv1.lastIndexOf('a', 2));
    System.out.println("Last Index Of Stroka: " + kv1.lastIndexOf(kv2));

    boolean kv5 = kv1.matches("Kazakhstanstan");
    System.out.println(kv5);
    boolean kv6 = kv1.matches("(.*)Kazakh(.*)");
    System.out.println(kv6);

    boolean kv7 = kv1.regionMatches(true, 6, "Stan", 0, 4);
    System.out.println(kv7);

    String str100 = "Менин атым Сымбат Сымбат";
    String str200 = "Сымбат";
    System.out.println(str100.regionMatches(false, 11, str200, 0, 5));
    System.out.println(str100.replace("н", "ж"));
    System.out.println(str100.replaceAll("Сымбат", "Соня"));
    System.out.println(str100.replaceAll("(.*)атым(.*)", "есимим"));
    System.out.println(str200.startsWith("Сым"));
    System.out.println(str100.subSequence(7, 18));
    String Str = new String("Добро-пожаловать-на-ProgLang.su");
    System.out.println("Возвращаемое значение: ");
    for (String retval : Str.split("-", 2)) {
        System.out.println(retval);
    }
    System.out.println();
    System.out.println("Возвращаемое значение: ");
    for (String retval : Str.split("-", 3)) {
        System.out.println(retval);
    }
    System.out.println();
    System.out.println("Возвращаемое значение: ");
    for (String retval : Str.split("-", 0)) {
        System.out.println(retval);
    }
    System.out.println();
    System.out.println("Возвращаемое значение: ");
    for (String retval : Str.split("-")) {
        System.out.println(retval);
    }
    String withoutEnd = "Hello";
    int a = withoutEnd.length();
    String str = withoutEnd.substring(1, a - 1);
    System.out.println(str);


   String aa = "abc";
   String bb ="cat";
  int aa1=aa.length();
  int bb1=bb.length();
  char sy=aa.charAt(aa1-1);
    char sw = bb.charAt(0);

  if(sy==sw) {
          String srf = aa.substring(0, aa1 - 1);
          String sre = srf.concat(bb);
          System.out.println(sre);
          }

   String str500 ="aidar";
   int aaa = str500.length();
   String qwe = str500.substring(0,1);
    if (qwe.equals("a")){
        System.out.println(qwe + str500.substring(1,aaa));
    }



}
}