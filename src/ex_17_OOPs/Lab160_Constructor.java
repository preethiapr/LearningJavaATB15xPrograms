package ex_17_OOPs;

public class Lab160_Constructor {
    static void main(String[] args) {
        Animal dog = new Animal();
        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();
    }
}

class MySQL {
    MySQL(){
        System.out.println("MySQL is connected!");
    }
}

class ReadExcelFile{
    ReadExcelFile(){
        System.out.println("Excel file is loaded!!");
    }
}

