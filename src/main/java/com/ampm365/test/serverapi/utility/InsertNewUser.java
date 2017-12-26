package com.ampm365.test.serverapi.utility;

import com.ampm365.test.serverapi.base.ServerApiTest;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class InsertNewUser extends ServerApiTest{
    @Test
    public void WriteInTxt() throws Exception{
        File WriteFile = new File("D:\\output.txt");
        WriteFile.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(WriteFile));
        int num = 1000000;
        for(int i = 1;i<= 999999;i++){
            num = num + 1;
            out.write(String.valueOf(num)+"\r\n");
        }
        out.flush();
        out.close();
    }


}
