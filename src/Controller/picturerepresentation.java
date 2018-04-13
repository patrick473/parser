package Controller;

import Model.PictureObject;

import java.io.*;
import java.util.ArrayList;

public class picturerepresentation {

    public void searchpicture(String context){

        File csvFile = new File("src/Controller/pictures.csv");

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<PictureObject> POS = new ArrayList<PictureObject>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] representation = line.split(cvsSplitBy);

                PictureObject po = new PictureObject(representation[0],representation[1]);
                POS.add(po);

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        for (PictureObject i: POS){

            if( i.getDutchText().equals(context)){
                System.out.println(i.getRepresentingPicture());
            }
        }

    }
}
