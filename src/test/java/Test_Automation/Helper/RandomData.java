package Test_Automation.Helper;

import org.openqa.selenium.By;

import java.util.Random;

/**
 * Created by ahmet.ercikan on 10/20/2017.
 */
public class RandomData
{
    public static String serialNum() {
        String applicationRefNoCHARS = "1234567890";
        StringBuilder applicationRefNoKod = new StringBuilder();
        Random rnd2 = new Random();
        while (applicationRefNoKod.length() < 4) {
            int applicationRefNoIndex = (int) (rnd2.nextFloat() * applicationRefNoCHARS.length());
            applicationRefNoKod.append(applicationRefNoCHARS.charAt(applicationRefNoIndex));
        }
        String applicationRefNoStr = applicationRefNoKod.toString();
        return applicationRefNoStr;

    }
    public static String bankAccountNo() {
        String applicationRefNoCHARS = "1234567890";
        StringBuilder applicationRefNoKod = new StringBuilder();
        Random rnd2 = new Random();
        while (applicationRefNoKod.length() < 12) {
            int applicationRefNoIndex = (int) (rnd2.nextFloat() * applicationRefNoCHARS.length());
            applicationRefNoKod.append(applicationRefNoCHARS.charAt(applicationRefNoIndex));
        }
        String applicationRefNoStr = applicationRefNoKod.toString();
        return applicationRefNoStr;

    }
    public static String iban() {
        String applicationRefNoCHARS = "1234567890";
        StringBuilder applicationRefNoKod = new StringBuilder();
        Random rnd2 = new Random();
        while (applicationRefNoKod.length() < 24) {
            int applicationRefNoIndex = (int) (rnd2.nextFloat() * applicationRefNoCHARS.length());
            applicationRefNoKod.append(applicationRefNoCHARS.charAt(applicationRefNoIndex));
        }
        String applicationRefNoStr = applicationRefNoKod.toString();
        return "TR" + applicationRefNoStr;

    }
        public static String bankingCustomerNo() {
            String bankingCustomerNoCHARS = "123456789";
            StringBuilder bankingCustomerNoKod = new StringBuilder();
            Random rnd2 = new Random();
            while (bankingCustomerNoKod.length() < 7) {
                int bankingCustomerNoIndex = (int) (rnd2.nextFloat() * bankingCustomerNoCHARS.length());
                bankingCustomerNoKod.append(bankingCustomerNoCHARS.charAt(bankingCustomerNoIndex));
            }
            String bankingCustomerNoStr = bankingCustomerNoKod.toString();
            return bankingCustomerNoStr;

        }
    public static String applicationRefNo() {
        String applicationRefNoCHARS = "1234567890";
        StringBuilder applicationRefNoKod = new StringBuilder();
        Random rnd2 = new Random();
        while (applicationRefNoKod.length() < 7) {
            int applicationRefNoIndex = (int) (rnd2.nextFloat() * applicationRefNoCHARS.length());
            applicationRefNoKod.append(applicationRefNoCHARS.charAt(applicationRefNoIndex));
        }
        String applicationRefNoStr = applicationRefNoKod.toString();
        return applicationRefNoStr;

    }
    public static String newPinBlock() {
        String newPinBlockCHARS = "A1B2CD3EF4G5H6K7LMN3890";
        StringBuilder newPinBlockKod = new StringBuilder();
        Random rnd2 = new Random();
        while (newPinBlockKod.length() < 16) {
            int newPinBlockIndex = (int) (rnd2.nextFloat() * newPinBlockCHARS.length());
            newPinBlockKod.append(newPinBlockCHARS.charAt(newPinBlockIndex));
        }
        String newPinBlockStr = newPinBlockKod.toString();
        return newPinBlockStr;

    }
    public static String accountNo() {
        String ACCOUNTNO = "123456789";
        StringBuilder accountNo = new StringBuilder();
        Random rnd2 = new Random();
        while (accountNo.length() < 7) {
            int accountNoIndex = (int) (rnd2.nextFloat() * ACCOUNTNO.length());
            accountNo.append(ACCOUNTNO.charAt(accountNoIndex));
        }
        String accountNoStr = accountNo.toString();
        return accountNoStr;

    }
    public static String pageSize() {
        String PAGESIZECHARS = "1234567890";
        StringBuilder pageSize = new StringBuilder();
        Random rnd2 = new Random();
        while (pageSize.length() < 2) {
            int pageSizeIndex = (int) (rnd2.nextFloat() * PAGESIZECHARS.length());
            pageSize.append(PAGESIZECHARS.charAt(pageSizeIndex));
        }
        String pageSizeStr = pageSize.toString();
        return pageSizeStr;

    }
    public static String kartStatKod() {
        String KARTSTATKODCHARS = "ABCDEFGHIIJKLMNOPRSTUVYZ";
        StringBuilder kartStatKod = new StringBuilder();
        Random rnd2 = new Random();
        while (kartStatKod.length() < 2) {
            int kartStatKodIndex = (int) (rnd2.nextFloat() * KARTSTATKODCHARS.length());
            kartStatKod.append(KARTSTATKODCHARS.charAt(kartStatKodIndex));
        }
        String kartStatKodStr = kartStatKod.toString();
        return kartStatKodStr;

    }
    public static String tradeName() {
        String PROFILECHARS = "1234567890";
        StringBuilder profileName = new StringBuilder();
        Random rnd2 = new Random();
        while (profileName.length() < 3) {
            int profilenameIndex = (int) (rnd2.nextFloat() * PROFILECHARS.length());
            profileName.append(PROFILECHARS.charAt(profilenameIndex));
        }
        String profileNameStr = profileName.toString();
        return "TestAuto" + profileNameStr + "Kırtasiye";

    }
    public static String getProfilName() {
        String PROFILECHARS = "1234567890";
        StringBuilder profileName = new StringBuilder();
        Random rnd2 = new Random();
        while (profileName.length() < 5) {
            int profilenameIndex = (int) (rnd2.nextFloat() * PROFILECHARS.length());
            profileName.append(PROFILECHARS.charAt(profilenameIndex));
        }
        String profileNameStr = profileName.toString();
        return "TestAuto" + profileNameStr;

    }
    public static String logoKodu() {
        String LOGOKODUCHARS = "1234567890";
        StringBuilder logoKodu = new StringBuilder();
        Random rnd2 = new Random();
        while (logoKodu.length() < 10) {
            int logoKoduIndex = (int) (rnd2.nextFloat() * LOGOKODUCHARS.length());
            logoKodu.append(LOGOKODUCHARS.charAt(logoKoduIndex));
        }
        String logoKoduStr = logoKodu.toString();
        return "20" + logoKoduStr + "07";

    }
    public static String musteriKodu() {
        String MUSTERIKODUCHARS = "1234567890";
        StringBuilder musteriKodu = new StringBuilder();
        Random rnd2 = new Random();
        while (musteriKodu.length() < 2) {
            int musteriKoduIndex = (int) (rnd2.nextFloat() * MUSTERIKODUCHARS.length());
            musteriKodu.append(MUSTERIKODUCHARS.charAt(musteriKoduIndex));
        }
        String musteriKoduStr = musteriKodu.toString();
        return musteriKoduStr;

    }
    public static String Aciklama() {
        String aciklamaCHARS = "1234567890";
        StringBuilder aciklama = new StringBuilder();
        Random rnd2 = new Random();
        while (aciklama.length() < 3) {
            int aciklamaIndex = (int) (rnd2.nextFloat() * aciklamaCHARS.length());
            aciklama.append(aciklamaCHARS.charAt(aciklamaIndex));
        }
        String aciklamaStr = aciklama.toString();
        return "Test Otomasyon Açıklama_" + aciklamaStr;
    }
    public static String aciklamaEN() {
        String aciklamaCHARS = "1234567890";
        StringBuilder aciklama = new StringBuilder();
        Random rnd2 = new Random();
        while (aciklama.length() < 3) {
            int aciklamaIndex = (int) (rnd2.nextFloat() * aciklamaCHARS.length());
            aciklama.append(aciklamaCHARS.charAt(aciklamaIndex));
        }
        String aciklamaStr = aciklama.toString();
        return "Test Automation Description" + aciklamaStr;
    }
    public static String riskGrupKod() {
        String CHARS = "1234567890";
        StringBuilder kod = new StringBuilder();
        Random rnd2 = new Random();
        while (kod.length() < 3) {
            int kodIndex = (int) (rnd2.nextFloat() * CHARS.length());
            kod.append(CHARS.charAt(kodIndex));
        }
        String kodStr = kod.toString();
        return kodStr;
    }
    public static String riskGrupMaxLimit() {
        String CHARS = "123456789";
        StringBuilder limit = new StringBuilder();
        Random rnd2 = new Random();
        while (limit.length() < 4) {
            int kodIndex = (int) (rnd2.nextFloat() * CHARS.length());
            limit.append(CHARS.charAt(kodIndex));
        }
        String limitStr = limit.toString();
        return limitStr;
    }
    public static String musteriNo()
    {
        String CHARS = "1234567890";
        StringBuilder musterNo = new StringBuilder();
        Random rnd2 = new Random();
        while (musterNo.length() < 10) {
            int musterNoIndex = (int) (rnd2.nextFloat() * CHARS.length());
            musterNo.append(CHARS.charAt(musterNoIndex));
        }
        String musterNoStr = musterNo.toString();
        return musterNoStr;
    }
    public static String isyeriAdi()
    {
        String CHARS = "1234567890";
        StringBuilder isyeriAdi = new StringBuilder();
        Random rnd2 = new Random();
        while (isyeriAdi.length() < 4) {
            int isyeriAdiIndex = (int) (rnd2.nextFloat() * CHARS.length());
            isyeriAdi.append(CHARS.charAt(isyeriAdiIndex));
        }
        String isyeriAdiStr = isyeriAdi.toString();
        return "Test Uye Isyeri-" + isyeriAdiStr;
    }
    public static String tuzelUnvan()
    {
        String CHARS = "1234567890";
        StringBuilder tuzelUnvan = new StringBuilder();
        Random rnd2 = new Random();
        while (tuzelUnvan.length() < 4) {
            int tuzelUnvanIndex = (int) (rnd2.nextFloat() * CHARS.length());
            tuzelUnvan.append(CHARS.charAt(tuzelUnvanIndex));
        }
        String tuzelUnvanStr = tuzelUnvan.toString();
        return "Tuzel Unvan-" + tuzelUnvanStr;
    }
    public static String BKMMcc()
    {
        String CHARS = "1234567890";
        StringBuilder BKMMcc = new StringBuilder();
        Random rnd2 = new Random();
        while (BKMMcc.length() < 6) {
            int BKMMccIndex = (int) (rnd2.nextFloat() * CHARS.length());
            BKMMcc.append(CHARS.charAt(BKMMccIndex));
        }
        String BKMMccStr = BKMMcc.toString();
        return BKMMccStr;
    }
    public static String BKMId()
    {
        String CHARS = "1234567890";
        StringBuilder BKMId = new StringBuilder();
        Random rnd2 = new Random();
        while (BKMId.length() < 12) {
            int BKMIdIndex = (int) (rnd2.nextFloat() * CHARS.length());
            BKMId.append(CHARS.charAt(BKMIdIndex));
        }
        String BKMIdStr = BKMId.toString();
        return BKMIdStr;
    }
    public static String vergiDairesi()
    {
        String CHARS = "1234567890";
        StringBuilder vergiDairesi = new StringBuilder();
        Random rnd2 = new Random();
        while (vergiDairesi.length() < 4) {
            int vergiDairesiIndex = (int) (rnd2.nextFloat() * CHARS.length());
            vergiDairesi.append(CHARS.charAt(vergiDairesiIndex));
        }
        String vergiDairesiStr = vergiDairesi.toString();
        return "Test Vergi Dairesi-" + vergiDairesiStr;
    }
    public static String vergiDairesiKodu()
    {
        String CHARS = "1234567890";
        StringBuilder vergiDairesiKodu = new StringBuilder();
        Random rnd2 = new Random();
        while (vergiDairesiKodu.length() < 6) {
            int vergiDairesiKoduIndex = (int) (rnd2.nextFloat() * CHARS.length());
            vergiDairesiKodu.append(CHARS.charAt(vergiDairesiKoduIndex));
        }
        String vergiDairesiKoduStr = vergiDairesiKodu.toString();
        return vergiDairesiKoduStr;
    }
    public static String vergiNo()
    {
        String CHARS = "1234567890";
        StringBuilder vergiDairesi = new StringBuilder();
        Random rnd2 = new Random();
        while (vergiDairesi.length() < 11) {
            int vergiDairesiIndex = (int) (rnd2.nextFloat() * CHARS.length());
            vergiDairesi.append(CHARS.charAt(vergiDairesiIndex));
        }
        String vergiDairesiStr = vergiDairesi.toString();
        return vergiDairesiStr;
    }
    public static String marketKodu()
    {
        String CHARS = "1234567890";
        StringBuilder marketKodu = new StringBuilder();
        Random rnd2 = new Random();
        while (marketKodu.length() < 3) {
            int marketKoduIndex = (int) (rnd2.nextFloat() * CHARS.length());
            marketKodu.append(CHARS.charAt(marketKoduIndex));
        }
        String marketKoduStr = marketKodu.toString();
        return marketKoduStr;
    }
    public static String satisTemsilcisi()
    {
        String CHARS = "1234567890";
        StringBuilder satisTemsilcisi = new StringBuilder();
        Random rnd2 = new Random();
        while (satisTemsilcisi.length() < 4) {
            int satisTemsilcisiIndex = (int) (rnd2.nextFloat() * CHARS.length());
            satisTemsilcisi.append(CHARS.charAt(satisTemsilcisiIndex));
        }
        String satisTemsilcisiStr = satisTemsilcisi.toString();
        return "Temsilci" + satisTemsilcisiStr;
    }
}
