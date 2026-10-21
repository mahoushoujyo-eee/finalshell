package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import com.finalshell.ui.model.Pt2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import javax.swing.tree.DefaultMutableTreeNode;

public class D5_2 implements SV {
   public com.finalshell.ui.panel.U3 b;
   public Map D = new WeakHashMap();
   public List d = new ArrayList(1);

   public D5_2(com.finalshell.ui.panel.U3 var1) {
      this.b = var1;
   }

   public com.finalshell.ui.panel.U3 F$u3() {
      return this.b;
   }

   public void f(com.finalshell.ui.panel.U3 var1) {
      this.D.clear();
      this.b = var1;
   }

   @Override
   public List p(boolean var1) {
      return this.E(Pt2.checked, var1);
   }

   @Override
   public List O() {
      return this.E(Pt2.mixed, false);
   }

   public List E(Pt2 var1, boolean var2) {
      String[] var10000 = CB3.C$arrString();
      ArrayList var4 = new ArrayList(this.D.size());
      String[] var3 = var10000;
      Iterator var5 = this.D.entrySet().iterator();

      while (true) {
         if (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            if (var3 == null) {
               break;
            }

            if (var6.getValue() == var1) {
               var4.add((DefaultMutableTreeNode)var6.getKey());
            }

            if (var3 != null) {
               continue;
            }
         }

         if (var2) {
            U4.z(var4);
         }
         break;
      }

      return var4;
   }

   @Override
   public void g(Collection var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      int var10000 = this.d.size();
      if (var3 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var4 = var10000;
      ArrayList var5 = null;
      if (var4 != 0) {
         var5 = new ArrayList(var1.size());
      }

      ArrayList var6 = new ArrayList();
      Iterator var7 = var1.iterator();

      while (true) {
         if (var7.hasNext()) {
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var7.next();
            this.g(var8, var2, var6, var5);
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         this.S(var6);
         this.o(var5);
         break;
      }
   }

   @Override
   public Pt2 P(DefaultMutableTreeNode var1) {
      String[] var10000 = CB3.C$arrString();
      Pt2 var3 = (Pt2)this.D.get(var1);
      String[] var2 = var10000;
      Pt2 var4 = var3;
      if (var2 != null) {
         var4 = var3 != null ? var3 : Pt2.unchecked;
      }

      return var4;
   }

   @Override
   public void s(DefaultMutableTreeNode var1, boolean var2) {
      String[] var3 = CB3.C$arrString();
      int var10000 = this.d.size();
      if (var3 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var4 = var10000;
      ArrayList var5 = null;
      if (var4 != 0) {
         var5 = new ArrayList(1);
      }

      ArrayList var6 = new ArrayList();
      this.g(var1, var2, var6, var5);
      this.S(var6);
      this.o(var5);
   }

   public void g(DefaultMutableTreeNode var1, boolean var2, List var3, List var4) {
      String[] var5;
      Pt2 var7;
      D5_2 var8;
      label40: {
         String[] var10000 = CB3.C$arrString();
         Pt2 var6 = this.P(var1);
         var5 = var10000;
         var7 = var2 ? Pt2.checked : Pt2.unchecked;
         if (var5 != null) {
            if (var6 == var7) {
               return;
            }

            var8 = this;
            if (var5 == null) {
               break label40;
            }

            this.g(var1, var7, var3);
         }

         if (var4 != null) {
            var4.add(new OD3(var1, var6, var7));
         }

         var8 = this;
      }

      if (var5 != null) {
         if (!var8.b.e()) {
            return;
         }

         this.h(var1, var7, var3, var4);
         var8 = this;
      }

      var8.f(var1, var3, var4);
   }

   public void f(DefaultMutableTreeNode var1, List var2, List var3) {
      Pt2 var12;
      String[] var10000 = CB3.C$arrString();
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.getParent();
      String[] var4 = var10000;

      while (var5 != null) {
         Pt2 var6 = Pt2.unchecked;
         boolean var7 = false;
         boolean var8 = false;
         int var9 = 0;

         while (true) {
            label86:
            if (var9 < var5.getChildCount()) {
               Pt2 var10 = this.P((DefaultMutableTreeNode)var5.getChildAt(var9));
               var12 = var10;
               if (var4 == null) {
                  break;
               }

               Pt2 var10001 = Pt2.mixed;
               if (var4 != null) {
                  if (var10 == Pt2.mixed) {
                     var6 = Pt2.mixed;
                     if (var4 != null) {
                        break label86;
                     }
                  }

                  var12 = var10;
                  var10001 = Pt2.checked;
               }

               label77: {
                  if (var4 != null) {
                     if (var12 == var10001) {
                        var7 = true;
                        if (var4 != null) {
                           if (var8) {
                              var6 = Pt2.mixed;
                              if (var4 != null) {
                                 break label86;
                              }
                           }

                           var6 = Pt2.checked;
                        }

                        if (var4 != null) {
                           break label77;
                        }
                     }

                     var12 = var10;
                     var10001 = Pt2.unchecked;
                  }

                  if (var12 == var10001) {
                     label68: {
                        var8 = true;
                        if (var4 != null) {
                           if (!var7) {
                              break label68;
                           }

                           var6 = Pt2.mixed;
                        }

                        if (var4 != null) {
                           break label86;
                        }
                     }

                     var6 = Pt2.unchecked;
                  }
               }

               var9++;
               if (var4 != null) {
                  continue;
               }
            }

            var12 = this.P(var5);
            break;
         }

         Pt2 var11 = var12;
         if (var4 != null) {
            if (var11 != var6) {
               label49: {
                  List var13 = var3;
                  if (var4 != null) {
                     if (var3 == null) {
                        break label49;
                     }

                     var13 = var3;
                  }

                  var13.add(new OD3(var5, var11, var6));
               }

               this.g(var5, var6, var2);
            }

            var5 = (DefaultMutableTreeNode)var5.getParent();
         }

         if (var4 == null) {
            break;
         }
      }
   }

   public void h(DefaultMutableTreeNode var1, Pt2 var2, List var3, List var4) {
      String[] var10000 = CB3.C$arrString();
      int var6 = 0;
      String[] var5 = var10000;

      while (var6 < var1.getChildCount()) {
         DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var1.getChildAt(var6);
         if (var5 != null) {
            if (var4 != null) {
               var4.add(new OD3(var7, this.P(var7), var2));
            }

            this.g(var7, var2, var3);
            this.h(var7, var2, var3, var4);
            var6++;
         }

         if (var5 == null) {
            break;
         }
      }
   }

   public void g(DefaultMutableTreeNode var1, Pt2 var2, List var3) {
      String[] var4 = CB3.C$arrString();
      label14:
      if (var4 != null) {
         if (var2 != Pt2.unchecked) {
            this.D.put(var1, var2);
            if (var4 != null) {
               break label14;
            }
         }

         this.D.remove(var1);
      }

      var3.add(var1);
   }

   @Override
   public void j(DefaultMutableTreeNode var1) {
      String[] var2 = CB3.C$arrString();
      int var10000 = this.d.size();
      if (var2 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var3 = var10000;
      ArrayList var4 = null;
      if (var3 != 0) {
         var4 = new ArrayList(1);
      }

      ArrayList var5 = new ArrayList();
      this.g(var1, this.k(this.P(var1)) == Pt2.checked, var5, var4);
      this.S(var5);
      this.o(var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void I(Collection var1) {
      Object var10;
      String[] var2 = CB3.C$arrString();
      int var10000 = this.d.size();
      if (var2 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var3 = var10000;
      ArrayList var4 = null;
      if (var3 != 0) {
         var4 = new ArrayList(var1.size());
      }

      ArrayList var5 = new ArrayList();
      boolean var6 = false;
      Iterator var7 = var1.iterator();

      label62: {
         while (true) {
            if (var7.hasNext()) {
               DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var7.next();
               if (var2 != null) {
                  var10 = this.P(var8);
                  if (var2 == null) {
                     break;
                  }

                  if (var10 != Pt2.checked) {
                     var6 = true;
                     if (var2 == null && var2 != null) {
                        continue;
                     }
                  } else if (var2 != null) {
                     continue;
                  }
               } else if (var2 == null && var2 != null) {
                  continue;
               }
            }

            var7 = var1.iterator();
            if (!var7.hasNext()) {
               break label62;
            }

            var10 = var7.next();
            break;
         }

         while (true) {
            DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var10;
            this.g(var9, var6, var5, var4);
            if (var2 == null) {
               return;
            }

            if (var2 == null || !var7.hasNext()) {
               break;
            }

            var10 = var7.next();
         }
      }

      this.S(var5);
      this.o(var4);
   }

   @Override
   public void c() {
      String[] var10000 = CB3.C$arrString();
      ArrayList var2 = null;
      String[] var1 = var10000;
      if (this.d.size() > 0) {
         var2 = new ArrayList(this.D.size());

         for (Entry var4 : this.D.entrySet()) {
            Pt2 var5 = (Pt2)var4.getValue();
            if (var1 == null) {
               return;
            }

            label30: {
               label29: {
                  Pt2 var6 = var5;
                  Pt2 var10001 = Pt2.mixed;
                  if (var1 != null) {
                     if (var5 == Pt2.mixed) {
                        break label29;
                     }

                     var6 = var5;
                     var10001 = Pt2.checked;
                  }

                  if (var6 != var10001) {
                     break label30;
                  }
               }

               var2.add(new OD3((DefaultMutableTreeNode)var4.getKey(), var5, Pt2.unchecked));
            }

            if (var1 == null) {
               break;
            }
         }
      }

      this.D.clear();
      this.F$void();
      this.o(var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void h() {
      String[] var10000 = CB3.C$arrString();
      List var2 = this.b.W();
      ArrayList var3 = null;
      String[] var1 = var10000;
      Iterator var4;
      if (this.d.size() > 0) {
         var3 = new ArrayList(var2.size());
         var4 = var2.iterator();

         while (true) {
            if (!var4.hasNext()) {
               var4 = var2.iterator();
               break;
            }

            DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var4.next();
            Pt2 var6 = this.P(var5);
            if (var1 == null) {
               if (var1 == null) {
                  return;
               }

               if (var1 == null) {
                  this.F$void();
                  this.o(var3);
                  return;
               }
               break;
            }

            if (var6 != Pt2.checked) {
               var3.add(new OD3(var5, var6, Pt2.checked));
            }

            if (var1 == null) {
               var4 = var2.iterator();
               break;
            }
         }
      } else {
         var4 = var2.iterator();
      }

      while (true) {
         if (!var4.hasNext()) {
            this.F$void();
            this.o(var3);
            break;
         }

         DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var4.next();
         this.D.put(var7, Pt2.checked);
         if (var1 == null) {
            break;
         }

         if (var1 == null) {
            this.F$void();
            this.o(var3);
            break;
         }
      }
   }

   public Pt2 k(Pt2 var1) {
      switch (Sn2.A[var1.ordinal()]) {
         case 1:
            return Pt2.checked;
         case 2:
            return Pt2.unchecked;
         case 3:
            return this.b.X() ? Pt2.checked : Pt2.unchecked;
         default:
            return Pt2.unchecked;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void y(boolean var1) {
      Entry var12;
      Object var16;
      String[] var2 = CB3.C$arrString();
      int var10000 = this.d.size();
      if (var2 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var3 = var10000;
      ArrayList var4 = null;
      if (var3 != 0) {
         var4 = new ArrayList();
      }

      ArrayList var5 = new ArrayList();
      if (!var1) {
         Iterator var10 = this.D.entrySet().iterator();

         while (var10.hasNext()) {
            var12 = (Entry)var10.next();
            if (var2 == null) {
               return;
            }

            label125: {
               Object var19 = var12.getValue();
               if (var2 != null) {
                  if (var19 != Pt2.mixed) {
                     break label125;
                  }

                  var19 = var12.getKey();
               }

               DefaultMutableTreeNode var15 = (DefaultMutableTreeNode)var19;
               var5.add(var15);
               var10.remove();
               ArrayList var20 = var4;
               if (var2 != null) {
                  if (var4 == null) {
                     break label125;
                  }

                  var20 = var4;
               }

               var20.add(new OD3(var15, Pt2.mixed, Pt2.unchecked));
            }

            if (var2 == null) {
               break;
            }
         }
      } else {
         ArrayList var6 = new ArrayList(this.D.size());
         Iterator var7 = this.D.entrySet().iterator();

         label114: {
            while (true) {
               if (var7.hasNext()) {
                  Entry var8 = (Entry)var7.next();
                  var16 = var8.getValue();
                  if (var2 == null) {
                     break;
                  }

                  if (var16 == Pt2.checked) {
                     var6.add((DefaultMutableTreeNode)var8.getKey());
                  }

                  if (var2 != null) {
                     continue;
                  }
               }

               this.I((List)var6);
               var7 = var6.iterator();
               if (!var7.hasNext()) {
                  break label114;
               }

               var16 = var7.next();
               break;
            }

            while (true) {
               DefaultMutableTreeNode var13 = (DefaultMutableTreeNode)var16;
               this.f(var13, var5, var4);
               this.h(var13, Pt2.checked, var5, var4);
               if (var2 == null) {
                  return;
               }

               if (var2 == null || !var7.hasNext()) {
                  break;
               }

               var16 = var7.next();
            }
         }

         if (var2 == null) {
            Iterator var9 = this.D.entrySet().iterator();

            while (var9.hasNext()) {
               Entry var11 = (Entry)var9.next();
               if (var2 == null) {
                  return;
               }

               label130: {
                  Object var17 = var11.getValue();
                  if (var2 != null) {
                     if (var17 != Pt2.mixed) {
                        break label130;
                     }

                     var17 = var11.getKey();
                  }

                  DefaultMutableTreeNode var14 = (DefaultMutableTreeNode)var17;
                  var5.add(var14);
                  var9.remove();
                  ArrayList var18 = var4;
                  if (var2 != null) {
                     if (var4 == null) {
                        break label130;
                     }

                     var18 = var4;
                  }

                  var18.add(new OD3(var14, Pt2.mixed, Pt2.unchecked));
               }

               if (var2 == null) {
                  break;
               }
            }
         }
      }

      this.S(var5);
      this.o(var4);
   }

   public void I(List var1) {
      String[] var10000 = CB3.C$arrString();
      Iterator var3 = var1.iterator();
      String[] var2 = var10000;

      label40:
      while (true) {
         boolean var7 = var3.hasNext();

         label38:
         while (var7) {
            DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var3.next();

            for (DefaultMutableTreeNode var6 : var1) {
               label32: {
                  if (var2 != null) {
                     var7 = this.E(var4, var6);
                     if (var2 == null) {
                        continue label38;
                     }

                     if (!var7) {
                        break label32;
                     }

                     var3.remove();
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               if (var2 == null) {
                  break;
               }
            }

            if (var2 == null) {
               return;
            }
            continue label40;
         }

         return;
      }
   }

   public boolean E(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      String[] var3 = CB3.C$arrString();
      Object var10000 = var1;
      if (var3 != null) {
         if (var1 == var2) {
            return false;
         }

         var10000 = var2;
      }

      if (var3 != null) {
         if (var10000 == null) {
            return true;
         }

         var10000 = var1.getParent();
      }

      Object var4 = var10000;

      while (var4 != null) {
         var10000 = var4;
         if (var3 != null) {
            if (var4 == var2) {
               return true;
            }

            var10000 = var4.getParent();
         }

         var4 = var10000;
         if (var3 == null) {
            break;
         }
      }

      return false;
   }

   public void F$void() {
      this.b.repaint(this.b.getVisibleRect());
   }

   public void S(List var1) {
      this.b.t(var1);
   }

   @Override
   public void J(Nb2 var1) {
      this.d.add(var1);
   }

   @Override
   public void e(Nb2 var1) {
      this.d.remove(var1);
   }

   public void o(List var1) {
      String[] var2 = CB3.C$arrString();
      List var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = this.d;
      }

      for (Nb2 var4 : AL_2.J((Collection)var10000)) {
         var4.f(var1);
         if (var2 == null) {
            break;
         }
      }
   }
}





