import model.ArrayLists;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import presenter.Presenter;
import view.View;


import java.awt.*;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;


class TestArrayLists {
    ArrayLists arrayList;
    View view;
    Presenter presenter;


    @BeforeEach
    void setUp() {
        arrayList = new ArrayLists();
        view = new View();
        presenter = new Presenter(arrayList, view);
    }


    @Test
    void getList1() {
        ArrayList<Integer> list1 = arrayList.getList1();
        assertNotNull(list1); // Проверяем, что список list1 не равен null
        assertTrue(list1.isEmpty()); // Проверяем, что список list1 пуст
    }

    @Test
    void getList2() {
        ArrayList<Integer> list2 = arrayList.getList2();
        assertNotNull(list2); // Проверяем, что список list2 не равен null
        assertTrue(list2.isEmpty()); // Проверяем, что список list2 пуст
    }

    @Test
    void testAddToList1() {
        arrayList.addToList1(10);
        arrayList.addToList1(20);
        ArrayList<Integer> list1 = arrayList.getList1();
        assertEquals(2, list1.size()); // Проверяем, что размер списка list1 равен 2
        assertTrue(list1.contains(10)); // Проверяем, что список list1 содержит элемент 10
        assertTrue(list1.contains(20)); // Проверяем, что список list1 содержит элемент 20
    }

    @Test
    void testAddToList2() {
        arrayList.addToList2(30);
        arrayList.addToList2(40);
        ArrayList<Integer> list2 = arrayList.getList2();
        assertEquals(2, list2.size()); // Проверяем, что размер списка list2 равен 2
        assertTrue(list2.contains(30)); // Проверяем, что список list2 содержит элемент 30
        assertTrue(list2.contains(40)); // Проверяем, что список list2 содержит элемент 40
    }


    @Test
    void testAvgList1() {
        arrayList.addToList1(10);
        arrayList.addToList1(20);
        int average = arrayList.avgList1();
        assertEquals(15, average); // Проверяем, что среднее значение списка list1 равно 15
    }

    @Test
    void testAvgList1_List1Null() {
        int average = arrayList.avgList1();
        assertEquals(0, average); // Проверяем, что среднее значение списка list1 равно 0, если список list1 пуст или равен null
    }

    @Test
    void testAvgList2() {
        arrayList.addToList2(30);
        arrayList.addToList2(40);
        int average = arrayList.avgList2();
        assertEquals(35, average); // Проверяем, что среднее значение списка list2 равно 15
    }

    @Test
    void testAvgList2_List1Null() {
        int average = arrayList.avgList2();
        assertEquals(0, average); // Проверяем, что среднее значение списка list2 равно 0, если список list1 пуст или равен null
    }

    @Test
    void testList2IsBigger() {
        arrayList.addToList1(10);
        arrayList.addToList1(20);
        arrayList.addToList2(30);
        arrayList.addToList2(40);
        int avg1 = arrayList.avgList1();
        int avg2 = arrayList.avgList2();
        arrayList.comparison(avg1, avg2);
        int expected = 35;
        assertEquals(expected, arrayList.comparison(avg1, avg2)); // Проверяем что  среднее значение списка list2 > list1
        System.setOut(System.out);
    }

    @Test
    void testList1IsBigger() {
        arrayList.addToList1(30);
        arrayList.addToList1(40);
        arrayList.addToList2(10);
        arrayList.addToList2(20);
        int avg1 = arrayList.avgList1();
        int avg2 = arrayList.avgList2();
        arrayList.comparison(avg1, avg2);
        int expected = 35;
        assertEquals(expected, arrayList.comparison(avg1, avg2)); // Проверяем что  среднее значение списка list1 > list2
        System.setOut(System.out);
    }

    @Test
    void testWhenAvgAreEqual() {
        arrayList.addToList1(30);
        arrayList.addToList1(30);
        arrayList.addToList2(30);
        arrayList.addToList2(30);
        int avg1 = arrayList.avgList1();
        int avg2 = arrayList.avgList2();
        arrayList.comparison(avg1, avg2);
        int expected = 30;
        assertEquals(expected, arrayList.comparison(avg1, avg2)); // Проверяем что  среднее значение списка list1 = list2
        System.setOut(System.out);
    }

    @Test
    public void testComparisonNull() {
        int avg1 = 0;
        int avg2 = 5;
        int expected = 0;
        int result = arrayList.comparison(avg1, avg2);
        assertEquals(expected, result);
    }


    @Test
    public void testAvgList2EmptyList() {
        arrayList.addToList2(20);
        arrayList.addToList2(30);
        ArrayList<Integer> list2 = arrayList.getList2();
        int expected = 25;
        int result = arrayList.avgList2();
        assertEquals(expected, result);
    }

    @Test
    public void testAvgList2Null() {
        int expected = 0;
        int result = arrayList.avgList2();
        assertEquals(expected, result);
    }

    // Add more tests as needed



    @Test
    public void testProcessLists_ValidLists() {
        // Arrange: Подготовка входных данных

        arrayList.getList1().add(5);
        arrayList.getList1().add(10);
        arrayList.getList2().add(3);
        arrayList.getList2().add(7);


        // Проверка, что метод avgList1() вернул среднее значение первого списка
        assertEquals(7, arrayList.avgList1());

        // Проверка, что метод avgList2() вернул среднее значение второго списка
        assertEquals(5, arrayList.avgList2());

        // Метод comparison() не нужно проверять, так как он может выполнять любую операцию.
    }


}
