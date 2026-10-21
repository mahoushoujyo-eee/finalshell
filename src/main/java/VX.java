import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
      com.c.c(563076254564406524L).set(this, new ArrayList());
      com.c.c(343373395241777329L)
         .set(
            this,
            new String[]{
               (String)com.c.c(576410519790209394L).get(null), (String)com.c.c(530558751127472782L).get(null), (String)com.c.c(213259110727198984L).get(null)
            }
         );
   }

   public String m(int var1) {
      return ((String[])com.c.c(343373395241777329L).get(this))[var1];
   }

   public int N(String var1) {
      int var3 = -1;
      int var4 = 0;
      String var10000 = Y_.j();
      Iterator var5 = ((ArrayList)com.c.c(563076254564406524L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         label33:
         if (var5.hasNext()) {
            lN_3 var6 = (lN_3)var5.next();
            if (var2 != null) {
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(194080076253066315L);
               Object[] var10002 = var10001;
               lN_3 var11 = var6;
               Method var8 = var10003;

               try {
                  var10000 = (String)var8.invoke(var11, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               var10 = var10000.equals(var1);
               if (var2 == null) {
                  break;
               }

               if (var10 != 0) {
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

         var10 = var3;
         break;
      }

      return var10;
   }

   public void b(ArrayList var1) {
      com.c.c(563076254564406524L).set(this, var1);
      this.fireTableDataChanged();
   }

   public lN_3 O(int var1) {
      return (lN_3)((ArrayList)com.c.c(563076254564406524L).get(this)).get(var1);
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(563076254564406524L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(343373395241777329L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(343373395241777329L).get(this)).length;
   }

   @Override
   public Class getColumnClass(int var1) {
      return lN_3.class;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      lN_3 var3 = (lN_3)((ArrayList)com.c.c(563076254564406524L).get(this)).get(var1);
      return ((ArrayList)com.c.c(563076254564406524L).get(this)).get(var1);
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      super.setValueAt(var1, var2, var3);
      String[] var10000 = Y_.j();
      lN_3 var5 = (lN_3)((ArrayList)com.c.c(563076254564406524L).get(this)).get(var2);
      String[] var4 = var10000;
      if (var4 != null) {
         if (var3 != 0) {
            return;
         }

      }

      if (var4 != null) {
         boolean var6 = true;
         if (false) {
            return;
         }

         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(194080076253066315L);
         Object[] var10003 = var10002;
         lN_3 var22 = var5;
         Method var10001 = var10004;

         try {
            var17 = var10001.invoke(var22, var10003);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         com.c.c(612168217893383274L).set(this, var17);
         Object[] var18 = com.c.a(var6);
         Method var25 = com.c.d(541760561293272394L);
         var10002 = var18;
         lN_3 var19 = var5;
         Method var13 = var25;

         try {
            var13.invoke(var19, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      }

      label64: {
         for (lN_3 var8 : (ArrayList)com.c.c(563076254564406524L).get(this)) {
            label81: {
               lN_3 var14 = var8;
               if (var4 != null) {
                  var15 = var8.equals(var5);
                  if (var4 == null) {
                     break label64;
                  }

                  if (var15 != 0) {
                     break label81;
                  }

                  var14 = var8;
               }

               Object[] var20 = com.c.a(false);
               Method var26 = com.c.d(541760561293272394L);
               Object[] var24 = var20;
               lN_3 var21 = var14;
               Method var16 = var26;

               try {
                  var16.invoke(var21, var24);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }
            }

            if (var4 == null) {
               break;
            }
         }

         var15 = 0;
      }

      int var12 = var15;

      while (var12 < ((ArrayList)com.c.c(563076254564406524L).get(this)).size()) {
         this.fireTableCellUpdated(var12, 0);
         var12++;
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String[] var3 = Y_.j();
      int var10000 = var2;
      if (var3 != null) {
         if (var2 == 0) {
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   public String C() {
      return (String)com.c.c(612168217893383274L).get(this);
   }

   public void B(String var1) {
      com.c.c(612168217893383274L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
            com.c.c(576410519790209394L).set(null, var0[2]);
            com.c.c(530558751127472782L).set(null, var0[0]);
            com.c.c(213259110727198984L).set(null, var0[1]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





