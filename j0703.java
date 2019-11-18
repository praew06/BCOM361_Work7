import java.io.*;
public class j0703 {
  public static void main (String args[]) throws IOException {
    int i = 0;
    String b;
    String[] fields;
    String[] recs = new String[100]; // only 3 records
    //String patternStr = ",";
    //
    FileReader fin = new FileReader("data_products.txt");
    BufferedReader bin = new BufferedReader (fin);
    //
    while ((b =  bin.readLine()) != null) {
      recs[i] = b;
      i = i + 1;
    }
    fin.close();
    //
    FileOutputStream fout1 = new FileOutputStream("sup_Bcompany.txt");
    BufferedOutputStream bout1 = new BufferedOutputStream(fout1);
    PrintStream pout = new PrintStream(bout1);
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");

	if(fields[2].equals("1"))

      pout.println(fields[0]+","+fields[1]+","+Integer.valueOf(fields[4]).intValue() +","+100  +"," + fields[4]);
    // pout.print(Integer.valueOf(fields[4]).intValue() + 100);
     //pout.println(","+fields[4]);
    }
    pout.close();

	FileOutputStream fout2 = new FileOutputStream("sup_Bcompany.txt");
    BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
    PrintStream pout2 = new PrintStream(bout2);
    for(int j=0;j<i;j++) {
      fields = recs[j].split(",");

	if(fields[2].equals("2"))
      pout2.println(fields[0]+","+fields[1]+","+Integer.valueOf(fields[4]).intValue() +","+ 100 +"," + fields[4]);
    }
    pout2.close();
  }
}