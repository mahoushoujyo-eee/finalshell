package com.finalshell.ui.model;

import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Q6 extends AbstractTableModel {
   public ArrayList v;
   public String[] N;
   public Class[] j;
   public static long a;

   public Q6() {
      ArrayList var10001 = new ArrayList();
      long var2 = 593268998095649359L;
      ArrayList var1 = var10001;
      Ref.s(593268998095649359L, var1, var2);
      Class[] var10002 = new Class[]{Object.class};
      long var4 = 382572070510439589L;
      Class[] var3 = var10002;
      Ref.s(382572070510439589L, var3, var4);
      String[] var10003 = new String[]{""};
      long var6 = 332657287529601498L;
      String[] var5 = var10003;
      Ref.s(332657287529601498L, var5, var6);
   }

   @Override
   public int getRowCount() {
      String var10000 = Vn2.C();
      int var2 = (int)a;
      String var1 = var10000;
      Object var3 = 593268998095649359L;
      Q6 var10001 = ((ArrayList)Ref.g(593268998095649359L, var3)).size();
      if (var1 == null) {
         if (var10001 > var2) {
            return var2;
         }

         var10001 = this;
         Object var5 = 593268998095649359L;
         ((ArrayList)Ref.g(593268998095649359L, var5)).size();
      }

      return (int)var10001;
   }

   @Override
   public int getColumnCount() {
      Object var1 = 332657287529601498L;
      return ((String[])Ref.g(332657287529601498L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 593268998095649359L;
      return ((ArrayList)Ref.g(593268998095649359L, var3)).get(var1);
   }

   public ArrayList J() {
      Object var1 = 593268998095649359L;
      return (ArrayList)Ref.g(593268998095649359L, var1);
   }

   public void B(ArrayList var1) {
      long var3 = 593268998095649359L;
      Ref.s(593268998095649359L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 423249386125184514L;
      long var10002 = -7628093244644733412L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





