package com.finalshell.ui.model;

import com.finalshell.core.AL_2;
import com.finalshell.core.Cz2;
import com.finalshell.core.I22;
import com.finalshell.core.Nd4;
import com.finalshell.ui.panel.Kz4;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Pl2 extends AbstractTableModel{
   public List O;
   public List x;
   public static String b;

   public Pl2() {
      this(new ArrayList(), AL_2.J((Collection)Nd4.q));
   }

   public Pl2(String[] var1) {
      this(new ArrayList(), Arrays.asList(var1));
   }

   public Pl2(List var1) {
      this(new ArrayList(), var1);
   }

   public Pl2(Collection var1, String[] var2) {
      this(var1, Arrays.asList(var2));
   }

   public Pl2(Collection var1, List var2) {
      this.O = var2;
      this.x = new ArrayList(var1);
   }

   public void L(Collection var1) {
      this.x.clear();
      this.x.addAll(var1);
      this.fireTableDataChanged();
   }

   public void d(Collection var1) {
      String var2 = Kz4.M();
      int var10000 = var1.size();
      if (var2 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = this.x.size();
      }

      int var3 = var10000;
      this.x.addAll(var1);
      this.fireTableRowsInserted(var3, var3 + var1.size() - 1);
   }

   public int A(File var1) {
      return this.x.indexOf(var1);
   }

   public File m(int var1) {
      return (File)this.x.get(var1);
   }

   public void s(List var1) {
      this.O = var1;
      this.fireTableStructureChanged();
   }

   public String z(int var1) {
      return (String)this.O.get(var1);
   }

   public boolean S(String var1) {
      return this.O.contains(var1);
   }

   public int y(String var1) {
      return this.O.indexOf(var1);
   }

   @Override
   public String getColumnName(int var1) {
      return I22.O((String)this.O.get(var1));
   }

   @Override
   public int getRowCount() {
      return this.x.size();
   }

   @Override
   public int getColumnCount() {
      return this.O.size();
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return this.x.get(var1);
   }

   @Override
   public Class getColumnClass(int var1) {
      return File.class;
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String var3 = Kz4.M();
      boolean var10000 = this.z(var2).equals(b);
      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = Cz2.J(this.m(var1));
      }

      return var3 == null ? var10000 : var10000;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "k(G]\u0012\\7z$IT\u0010Rvs>@C]Nx~!@\u001f\u0010Uui K\u001f\u001d[ty".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 3;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      } else {
         var6 = 3;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 3;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 31;
               break;
            case 1:
               var23 = 78;
               break;
            case 2:
               var23 = 38;
               break;
            case 3:
               var23 = 50;
               break;
            case 4:
               var23 = 112;
               break;
            case 5:
               var23 = 57;
               break;
            default:
               var23 = 26;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





