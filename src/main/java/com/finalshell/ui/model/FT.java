package com.finalshell.ui.model;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FT extends AbstractTableModel {
   public ArrayList G;
   public String[] F;
   public Class[] H;
   public static String a;

   public FT() {
      ArrayList var10001 = new ArrayList();
      long var2 = 234790626336419274L;
      ArrayList var1 = var10001;
      Ref.s(234790626336419274L, var1, var2);
      String[] var10002 = new String[]{a};
      long var4 = 568529913670890891L;
      String[] var3 = var10002;
      Ref.s(568529913670890891L, var3, var4);
      Class[] var10003 = new Class[]{Object.class};
      long var6 = 300909370335316961L;
      Class[] var5 = var10003;
      Ref.s(300909370335316961L, var5, var6);
   }

   @Override
   public int getRowCount() {
      Object var1 = 234790626336419274L;
      return ((ArrayList)Ref.g(234790626336419274L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      return 1;
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 568529913670890891L;
      return ((String[])Ref.g(568529913670890891L, var2))[var1];
   }

   public void g() {
      Object var1 = 234790626336419274L;
      ((ArrayList)Ref.g(234790626336419274L, var1)).clear();
   }

   @Override
   public Class getColumnClass(int var1) {
      Object var2 = 300909370335316961L;
      return ((Class[])Ref.g(300909370335316961L, var2))[var1];
   }

   public void I(int var1) {
      Object var2 = 234790626336419274L;
      ((ArrayList)Ref.g(234790626336419274L, var2)).remove(var1);
      this.fireTableRowsDeleted(var1, var1);
   }

   public synchronized void R(L1 var1) {
      Object var2 = 234790626336419274L;
      ((ArrayList)Ref.g(234790626336419274L, var2)).add(var1);
      Object var4 = 234790626336419274L;
      int var10003 = ((ArrayList)Ref.g(234790626336419274L, var4)).size() - 1;
      Object var6 = 234790626336419274L;
      var10003.fireTableRowsInserted((int)this, ((ArrayList)Ref.g(234790626336419274L, var6)).size() - 1);
   }

   public synchronized void S(L1 var1) {
      Object var2 = 234790626336419274L;
      ((ArrayList)Ref.g(234790626336419274L, var2)).add(0, var1);
      this.fireTableRowsInserted(0, 0);
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var4 = 234790626336419274L;
      return (L1)((ArrayList)Ref.g(234790626336419274L, var4)).get(var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0016%r".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 98;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      } else {
         var6 = 98;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 23;
               break;
            case 1:
               var23 = 42;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 94;
               break;
            case 5:
               var23 = 24;
               break;
            default:
               var23 = 6;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





