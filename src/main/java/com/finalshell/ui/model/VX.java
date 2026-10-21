package com.finalshell.ui.model;

import com.finalshell.core.LN3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class VX extends AbstractTableModel {
   ArrayList r;
   public static String z;
   public static String c;
   public static String O;
   String[] M;
   String f;

   public VX() {
      ArrayList var10001 = new ArrayList();
      long var2 = 563076254564406524L;
      ArrayList var1 = var10001;
      Ref.s(563076254564406524L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(576410519790209394L).get(null),
         (String)Registry.lookupField(530558751127472782L).get(null),
         (String)Registry.lookupField(213259110727198984L).get(null)
      };
      long var4 = 343373395241777329L;
      String[] var3 = var10002;
      Ref.s(343373395241777329L, var3, var4);
   }

   public String m(int var1) {
      Object var2 = 343373395241777329L;
      return ((String[])Ref.g(343373395241777329L, var2))[var1];
   }

   public int N(String var1) {
      Object var3 = -1;
      Object var4 = false;
      ImportPanel.j();
      Object var7 = 563076254564406524L;
      Iterator var5 = ((ArrayList)Ref.g(563076254564406524L, var7)).iterator();
      VX var2 = this;

      Object var10001;
      while (true) {
         label33:
         if (var5.hasNext()) {
            LN3 var6 = (LN3)var5.next();
            if (var2 != null) {
               var10001 = var6;
               String var10002 = Registry.emptyArgs();
               long var10 = 194080076253066315L;
               Object[] var9 = var10002;
               var10002 = Ref.h(194080076253066315L, var9, var10);

               try {
                  var10002 = (String)var10002;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               boolean var14 = var10002.equals(var1);
               if (var2 == null) {
                  break;
               }

               if (var14) {
                  var3 = var4;
                  if (var2 != null) {
                     break label33;
                  }
               }

               var4++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public void b(ArrayList var1) {
      long var3 = 563076254564406524L;
      Ref.s(563076254564406524L, var1, var3);
      this.fireTableDataChanged();
   }

   public LN3 O(int var1) {
      Object var2 = 563076254564406524L;
      return (LN3)((ArrayList)Ref.g(563076254564406524L, var2)).get(var1);
   }

   @Override
   public int getRowCount() {
      Object var1 = 563076254564406524L;
      return ((ArrayList)Ref.g(563076254564406524L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 343373395241777329L;
      return ((String[])Ref.g(343373395241777329L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 343373395241777329L;
      return ((String[])Ref.g(343373395241777329L, var1)).length;
   }

   @Override
   public Class getColumnClass(int var1) {
      return LN3.class;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var4 = 563076254564406524L;
      LN3 var3 = (LN3)((ArrayList)Ref.g(563076254564406524L, var4)).get(var1);
      Object var6 = 563076254564406524L;
      return ((ArrayList)Ref.g(563076254564406524L, var6)).get(var1);
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      super.setValueAt(var1, var2, var3);
      ImportPanel.j();
      Object var9 = 563076254564406524L;
      LN3 var5 = (LN3)((ArrayList)Ref.g(563076254564406524L, var9)).get(var2);
      VX var4 = this;
      if (this != null) {
         if (var3 != 0) {
            return;
         }

      }

      if (this != null) {
         boolean var6 = true;
         if (false) {
            return;
         }

         Object[] var10003 = Registry.emptyArgs();
         long var12 = 194080076253066315L;
         Object[] var11 = var10003;
         var10003 = Ref.h(194080076253066315L, var11, var12);
         long var14 = 612168217893383274L;
         Object var13 = var10003;
         Ref.s(612168217893383274L, var13, var14);
         Object[] var10004 = Registry.packArgs(var6);
         long var16 = 541760561293272394L;
         Object[] var15 = var10004;
         Ref.h(541760561293272394L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }

      Object var17 = 563076254564406524L;

      byte var10002;
      label59: {
         for (LN3 var8 : (ArrayList)Ref.g(563076254564406524L, var17)) {
            label76: {
               if (var4 != null) {
                  var10002 = (var8.equals(var5)) ? 1 : 0;
                  if (var4 == null) {
                     break label59;
                  }

                  if (var10002 != 0) {
                     break label76;
                  }
               }

               Object[] var27 = Registry.packArgs(false);
               long var20 = 541760561293272394L;
               Object[] var19 = var27;
               Ref.h(541760561293272394L, var19, var20);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            if (var4 == null) {
               break;
            }
         }

         var10002 = 0;
      }

      int var25 = var10002;

      do {
         Object var21 = 563076254564406524L;
         if (!(this < ((ArrayList)Ref.g(563076254564406524L, var21)).size())) {
            break;
         }

         this.fireTableCellUpdated(var25, 0);
         var25++;
      } while (var4 != null);
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String[] var3 = ImportPanel.j();
      int var10000 = var2;
      if (var3 != null) {
         if (var2 == 0) {
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }

   public String C() {
      Object var1 = 612168217893383274L;
      return (String)Ref.g(612168217893383274L, var1);
   }

   public void B(String var1) {
      long var3 = 612168217893383274L;
      Ref.s(612168217893383274L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "簚埂\u0002锞廯\u0002呬禹";
      int var5 = "簚埂\u0002锞廯\u0002呬禹".length();
      char var2 = 2;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 120;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 120;
               var10006 = var6;
            } else {
               var13 = 120;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 120;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 25;
                     break;
                  case 1:
                     var29 = 49;
                     break;
                  case 2:
                     var29 = 44;
                     break;
                  case 3:
                     var29 = 58;
                     break;
                  case 4:
                     var29 = 115;
                     break;
                  case 5:
                     var29 = 54;
                     break;
                  default:
                     var29 = 98;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            Registry.lookupField(576410519790209394L).set(null, var0[2]);
            Registry.lookupField(530558751127472782L).set(null, var0[0]);
            Registry.lookupField(213259110727198984L).set(null, var0[1]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





