public class HomeWork3 {
    public static void main(String[] args) {
        int [] myArray = {5, 48, 97, 657, 2};


        int firstArray = myArray[myArray.length - 1];//2 сохраняем чтоб не потерять в переменную firstArray
        myArray [4] = myArray[myArray.length - 5];//5 ставим в последний элемент массива myArray
        myArray [0] = firstArray;//2 ставим в первый элемент массива myArray
//Теперь вычислим сумму первого и среднего элемента массива myArray
        System.out.println("Сумма первого и среднего элемента массива = " + (myArray[0] + myArray[2]));
    }
}
