package exercice2.models;

import java.util.List;

import javax.xml.crypto.Data;

public class DataFetcher {
    
    public void getDataFromServer()
    {
        List<String> serveurData = TxtHelper.getDataFromTxt("serveur.txt");
        try {
            TxtHelper.clearDataLocal();
        }
        catch (FileNotFoundException f)
        {
            System.out.println("File not Found!");
            f.printStackTrace();
            return;
        }

        for (String d : serveurData)
        {
            TxtHelper.insertDataInTxt(d, "local.txt");
        }
    }    
}
