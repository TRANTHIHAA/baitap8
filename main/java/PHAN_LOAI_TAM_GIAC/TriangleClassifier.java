package PHAN_LOAI_TAM_GIAC;

public class TriangleClassifier {
    double canh1, canh2, canh3;
    String result = "";

    public static String TriangleClass(double canh1, double canh2, double canh3, String result) {
        if (canh1 > 0 && canh2 > 0 && canh3 > 0 && (canh1+canh2)>canh3 && (canh1+canh3)>canh2 && (canh2+canh3)>canh1){
           if (canh1 == canh2) {
               if (canh1 == canh3){
                   result = "tam giac deu";
               } else {
                   result = "tam giac can";
               }
           }else if(canh1!= canh3 && canh2 != canh3){
               result= "tam giac thuong";
           }
        } else {
            result = "ko phai tam giac";
        }

       return result;
    }
}
