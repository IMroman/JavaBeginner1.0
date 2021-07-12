public class HomeWork12 {
    public static void main(String[] args) {
//Напишите программу, принимающую на вход строку “I like Java!!!”
        String s = "I like Java!!!";
//1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean a = s.contains("Java");//true - содержит
        System.out.println(a);
//2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        a = s.startsWith("I like");//true - начинается идентично
        System.out.println(a);
//3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        a = s.endsWith("!!!");//true - заканчивается идентично
        System.out.println(a);
//4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (a == true) {
            System.out.println(s.toUpperCase());
        }
//5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
        s = s.replaceAll("a", "o");
        System.out.println(s.substring(7, 11));
    }
}
