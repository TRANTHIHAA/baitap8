package PHAN_LOAI_TAM_GIAC;

import NGAY8.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClass0() {
        double canh1 = 2;
        double canh2 = 2;
        double canh3 = 2;
        String str = "";
        String expected = "tam giac deu";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }

    @Test
    void triangleClass1() {
        double canh1 = 2;
        double canh2 = 2;
        double canh3 = 3;
        String str = "";
        String expected = "tam giac can";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }
    @Test
    void triangleClass2() {
        double canh1 = 3;
        double canh2 = 4;
        double canh3 = 5;
        String str = "";
        String expected = "tam giac thuong";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }
    @Test
    void triangleClass3() {
        double canh1 = 8;
        double canh2 = 2;
        double canh3 = 3;
        String str = "";
        String expected = "ko phai tam giac";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }

    @Test
    void triangleClass4() {
        double canh1 = -1;
        double canh2 = 2;
        double canh3 = 1;
        String str = "";
        String expected = "ko phai tam giac";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }

    @Test
    void triangleClass5() {
        double canh1 = 0;
        double canh2 = 1;
        double canh3 = 1;
        String str = "";
        String expected = "ko phai tam giac";
        String result = TriangleClassifier.TriangleClass(canh1,canh2,canh3,str);
        assertEquals(expected, result);
    }
}