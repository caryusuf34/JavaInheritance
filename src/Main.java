public class Main {
    public static void main(String[] args) {
        krediUi krediUi=new krediUi();

        krediUi.krediHesapla(new ogretmenKrediManeger());
        krediUi.krediHesapla(new askerKrediMenager());
        krediUi.krediHesapla(new tarimKrediMenager());

    }
}