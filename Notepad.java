import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;
import java.io.*;
public class Notepad extends Frame implements ActionListener  
{  
	JPanel pm;
    JFrame frm;  
    JMenuBar mnubr;  
    JMenu mnuFile, mnuEdit, mnuHelp;  
    JMenuItem miCut, miCopy, miPaste, miSelectAll,miOpen,miSave,miNew,miAbout,miExit,miFontSize,miFontStyle,miFontType;
    JTextArea txtarea;  
    Notepad()  
    {  
		Font fon = new Font("Monospaced",Font.PLAIN,14);
		
		pm = new JPanel();
		BorderLayout bl = new BorderLayout();
		pm.setLayout(bl);
			
        frm = new JFrame("NotePad");  
        miCut = new JMenuItem("Cut");  
        miCopy= new JMenuItem("Copy");  
        miPaste = new JMenuItem("Paste");  
        miSelectAll = new JMenuItem("Select All");  
		miOpen = new JMenuItem("Open");
		miSave = new JMenuItem("Save");
		miNew = new JMenuItem("New");
		miAbout = new JMenuItem("About");
		miFontSize = new JMenuItem("Size");
		miFontStyle = new JMenuItem("Style");
		miExit = new JMenuItem("Exit");
        miFontType = new JMenuItem("Type");
		miCopy.addActionListener(this);  
        miCut.addActionListener(this);  
        miSelectAll.addActionListener(this);  
        miPaste.addActionListener(this);  
		miOpen.addActionListener(this);  
        miSave.addActionListener(this);  
        miNew.addActionListener(this);  
        miAbout.addActionListener(this);
		miFontSize.addActionListener(this);  
        miFontStyle.addActionListener(this);  
        miExit.addActionListener(this);  
		miFontType.addActionListener(this);
		
        mnubr = new JMenuBar();  
        mnubr.setBounds(5, 5, 400, 40);  
		
        mnuFile = new JMenu("File");  
        mnuEdit = new JMenu("Edit");  
        mnuHelp = new JMenu("Help");  
		
        mnuEdit.add(miCut);  
        mnuEdit.add(miCopy);  
        mnuEdit.add(miPaste);  
        mnuEdit.add(miSelectAll);
		mnuEdit.add(miFontSize);  
        mnuEdit.add(miFontStyle);
		mnuEdit.add(miFontType);
		mnuFile.add(miNew);  
		mnuFile.add(miOpen);  
		mnuFile.add(miSave); 
		mnuFile.add(miExit);  
		
		mnuHelp.add(miAbout);
      
		
		
		
        mnubr.add(mnuFile);  
        mnubr.add(mnuEdit);  
        mnubr.add(mnuHelp);  
		pm.add("North",mnubr);
	
        txtarea = new JTextArea();  
        txtarea.setBounds(5, 30, 460, 460); 
		txtarea.setFont(fon);
		pm.add("Center",txtarea);		
		
		frm.setContentPane(pm);	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        frm.setSize(700, 700);  
        frm.setVisible(true);  
		frm.setResizable(false);
		
    }  
	
	
	public void mnItemAbout()
	{
		JFrame fn = new JFrame("About");
		JTextArea ta = new JTextArea("Hello! This NotePad is made by Ishan Sheth.");
		fn.add(ta);
		fn.setVisible(true);
		fn.setSize(500,500);
		fn.setResizable(false);
		//fn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void mnFS()
	{
	    JFrame fn1 = new JFrame("Font Size");
		String s1[] = {"8","10","12","16","20","26","36","40"};
		JComboBox c1 = new JComboBox(s1);
		ActionListener haha = new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				String s = (String) c1.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "8":
                        Font fon1 = new Font("Monospaced",Font.PLAIN,8);
						txtarea.setFont(fon1);
                        break;
                    case "10":
                        Font fon2 = new Font("Monospaced",Font.PLAIN,10);
						txtarea.setFont(fon2);
                        break;
                    case "12":
                        Font fon3 = new Font("Monospaced",Font.ITALIC,12);
						txtarea.setFont(fon3);
                        break;
					case "16":
                        Font fon4 = new Font("Monospaced",Font.BOLD,16);
						txtarea.setFont(fon4);
                        break;
					case "20":
                        Font fon5 = new Font("Monospaced",Font.PLAIN,20);
						txtarea.setFont(fon5);
                        break;
					case "26":
                        Font fon6 = new Font("Monospaced",Font.PLAIN,26);
						txtarea.setFont(fon6);
                        break;
					case "36":
                        Font fon7 = new Font("Monospaced",Font.PLAIN,36);
						txtarea.setFont(fon7);
                        break;
					case "40":
                        Font fon8 = new Font("Monospaced",Font.PLAIN,40);
						txtarea.setFont(fon8);
                        break;
                    default:
                        break;
                }
			}
		};
		
		c1.addActionListener(haha);
		
		
		fn1.add(c1);
		c1.setBounds(250,100,2,4);
		fn1.setVisible(true);
		fn1.setSize(100,100);
		fn1.setResizable(false);
	}
	public void mnFT()
	{
		JFrame fn3 = new JFrame("Font Type");
		String s2[] = {"B","I","P"};
		JComboBox c2 = new JComboBox(s2);
		ActionListener alL = new ActionListener()
		{
			public void actionPerformed(ActionEvent ae1)
			{
				String s = (String) c2.getSelectedItem();
				switch (s) {
					case "B":
						Font fon1 = new Font("Monospaced" , Font.BOLD,14);
						txtarea.setFont(fon1);
						break;
					case "I":
						Font fon2 = new Font("Monospaced" , Font.ITALIC,14);
						txtarea.setFont(fon2);
						break;
					case "P":
						Font fon3 = new Font("Monospaced" , Font.PLAIN,14);
						txtarea.setFont(fon3);
						break;
					default:
						break;
					}
			}
		};
		c2.addActionListener(alL);
		
		
		fn3.add(c2);
		c2.setBounds(250,100,2,4);
	    
		
		fn3.setVisible(true);
		fn3.setSize(500,500);
		fn3.setResizable(false);
	}
	public void mnFSL()
	{
		
		JFrame fn2 = new JFrame("Font Style");
		String s1[] = {"Mon","Ser","Sanser"};
		JComboBox c1 = new JComboBox(s1);
		ActionListener al = new ActionListener()
		{
			public void actionPerformed(ActionEvent qe)
			{
				String s = (String) c1.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Mon":
						Font fon1 = new Font("Monospaced",Font.PLAIN,14);
						txtarea.setFont(fon1);
                        break;
                    case "Ser":
                        Font fon2 = new Font("Serif",Font.PLAIN,14);
						txtarea.setFont(fon2);
                        break;
                    case "Sanser":
                        Font fon3 = new Font("SansSerif",Font.PLAIN,14);
						txtarea.setFont(fon3);
                        break;
					
                    default:
                        break;
                }
			}
		};
		
		c1.addActionListener(al);
		
		
		fn2.add(c1);
		c1.setBounds(250,100,2,4);
	    
		
		fn2.setVisible(true);
		fn2.setSize(500,500);
		fn2.setResizable(false);
	}
 
	
	
	
	
	
    public void actionPerformed(ActionEvent ae)  
    {  
        if (ae.getSource() == miCut)  
            txtarea.cut();  
        if (ae.getSource() == miPaste)  
            txtarea.paste();  
        if (ae.getSource() == miCopy)  
            txtarea.copy();  
        if (ae.getSource() == miSelectAll)  
            txtarea.selectAll();  
		if (ae.getSource() == miExit)
			System.exit(0);
		if (ae.getSource() == miAbout)
			mnItemAbout();
		if (ae.getSource() == miFontSize)
			mnFS();
		if (ae.getSource() == miFontStyle)
			mnFSL();
		if (ae.getSource() == miFontType)
			mnFT();
		/*if (ae.getSource() == miNew)
			mnNew();*/
		if (ae.getSource() == miOpen)
		{
			try
			{
				FileDialog fd = new FileDialog(this,"Open File",FileDialog.LOAD);
				fd.setVisible(true);
				String dir = fd.getDirectory();
				String fname = fd.getFile();
				FileInputStream fis = new FileInputStream(dir+fname);
				DataInputStream dis = new DataInputStream(fis);
				String str = " ",msg = " ";
				while((str = dis.readLine())!=null)
				{
					msg = msg+str;
					msg+="\n";
				}
				txtarea.setText(msg);
				dis.close();
			}
			catch(Exception e){}
		}
		if (ae.getSource() == miSave)
		{
			try
			{
				FileDialog fd = new FileDialog(this,"Save File",FileDialog.SAVE);
				fd.setVisible(true);
				String txt = txtarea.getText();
				String dir = fd.getDirectory();
				String fname = fd.getFile();
				FileOutputStream fos = new FileOutputStream(dir+fname+".txt");
				DataOutputStream dos = new DataOutputStream(fos);
				dos.writeBytes(txt);
				dos.close();
			}
			catch(Exception e){}
		}
				
		
    }  
	
    public static void main(String[] args)  
    {  
        new Notepad();  
    }  
} 


		