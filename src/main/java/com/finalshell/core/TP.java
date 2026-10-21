package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Map;
import java.util.WeakHashMap;

public class TP extends T4 {
   public boolean v;
   public boolean e;
   public boolean u;
   public boolean z;
   public int R;
   public int b;
   public int K;
   public int o;
   public Map s = new WeakHashMap();
   public static String[] a;
   public static String[] d;

   public TP() {
      this(false, true, 0, 0);
   }

   public TP(boolean var1, boolean var2) {
      this(var1, var2, 0, 0);
   }

   public TP(int var1, int var2) {
      this(false, true, var1, var2);
   }

   public TP(boolean var1, boolean var2, int var3, int var4) {
      this.v = var1;
      this.e = var2;
      this.K = var3;
      this.o = var4;
      this.u = false;
      this.z = false;
      this.R = 0;
      this.b = 0;
   }

   public boolean p() {
      return this.v;
   }

   public void Y(boolean var1) {
      this.v = var1;
   }

   public boolean s() {
      return this.e;
   }

   public void F(boolean var1) {
      this.e = var1;
   }

   public boolean q() {
      return this.u;
   }

   public void w(boolean var1) {
      this.u = var1;
   }

   public boolean U() {
      return this.z;
   }

   public void e(boolean var1) {
      this.z = var1;
   }

   public int r() {
      return this.R;
   }

   public void W(int var1) {
      this.R = var1;
   }

   public int i() {
      return this.b;
   }

   public void L(int var1) {
      this.b = var1;
   }

   public int E() {
      return this.K;
   }

   public void t(int var1) {
      this.K = var1;
   }

   public int B() {
      return this.o;
   }

   public void p(int var1) {
      this.o = var1;
   }

   @Override
   public void A(Component var1, Object var2) {
      Container var4 = var1.getParent();
      int var5 = var4.getComponentCount();
      boolean var6 = false;
      int var10000 = T4.b();
      int var7 = 0;
      int var3 = var10000;

      while (var7 < var5) {
         Component var8 = var4.getComponent(var7);
         String var9 = (String)this.s.get(var8);
         if (var9 != null) {
      boolean var11;
            label49: {
               label59: {
                  var11 = var6;
                  if (var3 != 0) {
                     if (var6) {
                        break label59;
                     }

                     var11 = var9.equals(a(844, -11134));
                  }

                  if (var3 == 0) {
                     break label49;
                  }

                  if (!var11) {
                     var11 = true;
                     break label49;
                  }
               }

               var11 = false;
            }

            var6 = var11;
         }

         label60: {
            Object var12 = var8;
            if (var3 != 0) {
               if (var8 != var1) {
                  break label60;
               }

               var12 = var2;
            }

            String var10 = var12 != null ? "" + var2 : (var6 ? a(841, 5483) : a(846, 4037));
            this.s.put(var1, var10);
            if (var3 != 0) {
               break;
            }
         }

         var7++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void F(Component var1) {
      this.s.remove(var1);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = T4.O();
      int var3 = var1.getComponentCount();
      int var2 = var10000;
      if (var3 > 0) {
         Map var4 = FN.B(var1);
         int var5 = 0;
         int var6 = 0;
         byte var7 = 0;
         int var8 = 0;

         while (var8 < var3) {
            Component var9 = var1.getComponent(var8);
            Dimension var10 = (Dimension)var4.get(var9);
            if (var2 != 0) {
               return;
            }

            label248: {
               boolean var33 = ((((boolean)var7) != 0) != 0) != 0;
               if (var2 == 0) {
                  if (!var7) {
                     var33 = ((String)this.s.get(var9)).equals(a(842, 19320));
                     if (var2 == 0) {
                        if (var33) {
                           var7 = 0;
                           if (var2 == 0) {
                              break label248;
                           }
                        }

                        var5 = Math.max(var5, var10.width);
                        var33 = true;
                     }

                     var7 = (var33) ? 1 : 0;
                     if (var2 == 0) {
                        break label248;
                     }
                  }

                  var6 = Math.max(var5, var10.width);
                  var33 = false;
               }

               var7 = (var33) ? 1 : 0;
            }

            var8++;
            if (var2 != 0) {
               break;
            }
         }

         Insets var25;
         label230: {
            label258: {
               var24 = var1.getSize();
               var25 = (var1.getInsets()) ? 1 : 0;
               var10000 = (this.v) ? 1 : 0;
               label228:
               if (var2 == 0) {
                  if (this.v) {
                     var10000 = (this.e) ? 1 : 0;
                     if (var2 != 0) {
                        break label228;
                     }

                     if (this.e) {
                        var10000 = var3;
                        int var10001 = 1;
                        if (var2 == 0) {
                           if (var3 > 1) {
                              var5 = (var24.width - var25.left - var25.right - this.K) / 2;
                              var6 = var5;
                              if (var2 == 0) {
                                 break label258;
                              }
                           }

                           var10000 = var24.width - var25.left;
                           var10001 = var25.right;
                        }

                        var5 = var10000 - var10001;
                        if (var2 == 0) {
                           break label258;
                        }
                     }
                  }

                  var10000 = (this.v) ? 1 : 0;
               }

               if (var2 == 0) {
                  if (var10000 != 0) {
                     var10000 = var3;
                     int var48 = 1;
                     if (var2 == 0) {
                        if (var3 > 1) {
                           var5 = var24.width - var25.left - var25.right - this.K - var6;
                           if (var2 == 0) {
                              break label258;
                           }
                        }

                        var10000 = var24.width - var25.left;
                        var48 = var25.right;
                     }

                     var5 = var10000 - var48;
                     if (var2 == 0) {
                        break label258;
                     }
                  }

                  var10000 = var3;
               }

               if (var2 != 0) {
                  break label230;
               }

               if (var10000 > 1) {
                  var6 = var24.width - var25.left - var25.right - this.K - var5;
               }
            }

            var10000 = var25.left;
         }

         int var26 = var10000;
         int var11 = var25.left + var5 + this.K;
         int var12 = var24.width - var25.left - var25.right;
         int var13 = var25.top;
         var7 = 0;
         int var14 = 0;

         while (var14 < var3) {
            label260: {
               Component var15 = var1.getComponent(var14);
               Dimension var16 = (Dimension)var4.get(var15);
               String var17 = (String)this.s.get(var15);
               var10000 = var7;
               if (var2 == 0) {
                  if (var7 == 0) {
                     var10000 = (var17.equals(a(842, 19320))) ? 1 : 0;
                     if (var2 == 0) {
                        if (var10000 != 0) {
                           int var18 = var16.height;
                           var15.setBounds(var26, var13, var12, var18);
                           var13 += var18 + this.o;
                           var7 = 0;
                           if (var2 == 0) {
                              break label260;
                           }
                        }

                        var10000 = var3;
                     }

                     if (var2 == 0) {
                        var10000 = var10000 > var14 + 1 ? ((Dimension)var4.get(var1.getComponent(var14 + 1))).height : 0;
                     }

                     int var19;
                     label188: {
                        int var27 = var10000;
                        var19 = Math.max(var16.height, var27);
                        TP var40 = this;
                        if (var2 == 0) {
                           if (this.u) {
                              var10000 = var13;
                              break label188;
                           }

                           var40 = this;
                        }

                        var10000 = var40.m(true, var13, var19, var16.height);
                     }

                     int var20 = (var10000) ? 1 : 0;
                     var10000 = (this.u) ? 1 : 0;
                     if (var2 == 0) {
                        var10000 = this.u ? var19 : var16.height;
                     }

                     label181: {
                        label262: {
                           int var21 = var10000;
                           int var22 = Math.min(var16.width, var5);
                           var43 = var17.equals(a(840, -28152));
                           if (var2 == 0) {
                              if (var43 != 0) {
                                 var15.setBounds(var26, var20, var22, var21);
                                 if (var2 == 0) {
                                    break label262;
                                 }
                              }

                              var43 = var17.equals(a(835, 27657));
                           }

                           if (var2 == 0) {
                              if (var43 != 0) {
                                 var15.setBounds(var26 + var5 / 2 - var22 / 2, var20, var22, var21);
                                 if (var2 == 0) {
                                    break label262;
                                 }
                              }

                              var43 = var17.equals(a(834, -19475));
                           }

                           if (var2 == 0) {
                              if (var43 != 0) {
                                 var15.setBounds(var26 + var5 - var22, var20, var22, var21);
                                 if (var2 == 0) {
                                    break label262;
                                 }
                              }

                              var43 = var17.equals(a(845, -7978));
                           }

                           if (var2 != 0) {
                              break label181;
                           }

                           if (var43 != 0) {
                              var15.setBounds(var26, var20, var5, var21);
                           }
                        }

                        var43 = 1;
                     }

                     var7 = var43;
                     if (var2 == 0) {
                        break label260;
                     }
                  }

                  var10000 = ((Dimension)var4.get(var1.getComponent(var14 - 1))).height;
               }

               int var29;
               label151: {
                  int var28 = var10000;
                  var29 = Math.max(var16.height, var28);
                  TP var44 = this;
                  if (var2 == 0) {
                     if (this.z) {
                        var10000 = var13;
                        break label151;
                     }

                     var44 = this;
                  }

                  var10000 = var44.m(false, var13, var29, var16.height);
               }

               int var30 = (var10000) ? 1 : 0;
               var10000 = (this.z) ? 1 : 0;
               if (var2 == 0) {
                  var10000 = this.z ? var29 : var16.height;
               }

               label144: {
                  label263: {
                     int var31 = var10000;
                     int var32 = Math.min(var16.width, var6);
                     var47 = var17.equals(a(843, -28574));
                     if (var2 == 0) {
                        if (var47 != 0) {
                           var15.setBounds(var11, var30, var32, var31);
                           if (var2 == 0) {
                              break label263;
                           }
                        }

                        var47 = var17.equals(a(847, -7337));
                     }

                     if (var2 == 0) {
                        if (var47 != 0) {
                           var15.setBounds(var11 + var6 / 2 - var32 / 2, var30, var32, var31);
                           if (var2 == 0) {
                              break label263;
                           }
                        }

                        var47 = var17.equals(a(834, -19475));
                     }

                     if (var2 == 0) {
                        if (var47 != 0) {
                           var15.setBounds(var11 + var6 - var32, var30, var32, var31);
                           if (var2 == 0) {
                              break label263;
                           }
                        }

                        var47 = var17.equals(a(845, -7978));
                     }

                     if (var2 != 0) {
                        break label144;
                     }

                     if (var47 != 0) {
                        var15.setBounds(var11, var30, var6, var31);
                     }
                  }

                  var13 += var29 + this.o;
                  var47 = 0;
               }

               var7 = var47;
            }

            var14++;
            if (var2 != 0) {
               break;
            }
         }
      }
   }

   public int m(boolean var1, int var2, int var3, int var4) {
      int var5;
      int var10000;
      label82: {
         label86: {
            var5 = (((((T4.O()) ? 1 : 0) != 0) != 0) ? 1 : 0) != 0;
            var10000 = (var1) ? 1 : 0;
            if (var5 == 0) {
               if (var1 != 0) {
                  var10000 = this.R;
                  if (var5 != 0) {
                     break label82;
                  }

                  if (this.R == 0) {
                     return var2 + var3 / 2 - var4 / 2;
                  }
                  break label86;
               }

               var10000 = this.b;
            }

            if (var5 != 0) {
               break label82;
            }

            if (var10000 == 0) {
               return var2 + var3 / 2 - var4 / 2;
            }
         }

         var10000 = (var1) ? 1 : 0;
      }

      label66: {
         label88: {
            if (var5 == 0) {
               if (var10000 != 0) {
                  var10000 = this.R;
                  if (var5 != 0) {
                     break label66;
                  }

                  if (this.R == 1) {
                     return var2;
                  }
                  break label88;
               }

               var10000 = this.b;
            }

            if (var5 != 0) {
               break label66;
            }

            if (var10000 == 1) {
               return var2;
            }
         }

         var10000 = (var1) ? 1 : 0;
      }

      if (var5 == 0) {
         if (var10000 != 0) {
            if (var5 != 0) {
               return this.R;
            }

            if (this.R == 3) {
               return var2 + var3 - var4;
            }

            return var2;
         }

         var10000 = this.b;
      }

      if (var5 != 0) {
         return var10000;
      } else {
         return var10000 == 3 ? var2 + var3 - var4 : var2;
      }
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var10000 = T4.O();
      int var3 = var1.getComponentCount();
      int var2 = var10000;
      Insets var4 = var1.getInsets();
      if (var3 <= 0) {
         return new Dimension(var4.left + var4.right, var4.top + var4.bottom);
      } else {
         Map var5 = FN.B(var1);
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;

         while (true) {
            if (var11 < var3) {
               Component var12 = var1.getComponent(var11);
               Dimension var13 = (Dimension)var5.get(var12);
               var10000 = var10;
               if (var2 != 0) {
                  break;
               }

               label62: {
                  if (var2 == 0) {
                     if (var10 == 0) {
                        var10000 = (((String)this.s.get(var12)).equals(a(842, 19320))) ? 1 : 0;
                        if (var2 == 0) {
                           if (var10000 != 0) {
                              var6 = Math.max(var6, var13.width);
                              var9 += var13.height + this.o;
                              var10 = 0;
                              if (var2 == 0) {
                                 break label62;
                              }
                           }

                           var7 = Math.max(var7, var13.width);
                           var10000 = var3;
                        }

                        if (var2 == 0) {
                           var10000 = var10000 > var11 + 1 ? ((Dimension)var5.get(var1.getComponent(var11 + 1))).height : 0;
                        }

                        int var14 = var10000;
                        var9 += Math.max(var13.height, var14) + this.o;
                        var10 = 1;
                        if (var2 == 0) {
                           break label62;
                        }
                     }

                     var8 = Math.max(var8, var13.width);
                     var10000 = 0;
                  }

                  var10 = var10000;
               }

               var11++;
               if (var2 == 0) {
                  continue;
               }
            }

            var9 -= this.o;
            var10000 = (this.v) ? 1 : 0;
            break;
         }

         if (var2 == 0) {
            if (var10000 == 0) {
               return new Dimension(var4.left + Math.max(var7 + this.K + var8, var6) + var4.right, var4.top + var9 + var4.bottom);
            }

            var10000 = (this.e) ? 1 : 0;
         }

         if (var2 == 0) {
            if (var10000 == 0) {
               return new Dimension(var4.left + Math.max(var7 + this.K + var8, var6) + var4.right, var4.top + var9 + var4.bottom);
            }

            var7 = Math.max(var7, var8);
            var10000 = var7;
         }

         var8 = var10000;
         return new Dimension(var4.left + Math.max(var7 + this.K + var8, var6) + var4.right, var4.top + var9 + var4.bottom);
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 843) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 74;
               break;
            case 1:
               var10000 = 143;
               break;
            case 2:
               var10000 = 30;
               break;
            case 3:
               var10000 = 9;
               break;
            case 4:
               var10000 = 26;
               break;
            case 5:
               var10000 = 95;
               break;
            case 6:
               var10000 = 193;
               break;
            case 7:
               var10000 = 239;
               break;
            case 8:
               var10000 = 198;
               break;
            case 9:
               var10000 = 18;
               break;
            case 10:
               var10000 = 10;
               break;
            case 11:
               var10000 = 240;
               break;
            case 12:
               var10000 = 149;
               break;
            case 13:
               var10000 = 181;
               break;
            case 14:
               var10000 = 106;
               break;
            case 15:
               var10000 = 111;
               break;
            case 16:
               var10000 = 93;
               break;
            case 17:
               var10000 = 156;
               break;
            case 18:
               var10000 = 16;
               break;
            case 19:
               var10000 = 178;
               break;
            case 20:
               var10000 = 96;
               break;
            case 21:
               var10000 = 209;
               break;
            case 22:
               var10000 = 235;
               break;
            case 23:
               var10000 = 124;
               break;
            case 24:
               var10000 = 199;
               break;
            case 25:
               var10000 = 133;
               break;
            case 26:
               var10000 = 35;
               break;
            case 27:
               var10000 = 97;
               break;
            case 28:
               var10000 = 24;
               break;
            case 29:
               var10000 = 82;
               break;
            case 30:
               var10000 = 170;
               break;
            case 31:
               var10000 = 204;
               break;
            case 32:
               var10000 = 98;
               break;
            case 33:
               var10000 = 17;
               break;
            case 34:
               var10000 = 84;
               break;
            case 35:
               var10000 = 38;
               break;
            case 36:
               var10000 = 71;
               break;
            case 37:
               var10000 = 70;
               break;
            case 38:
               var10000 = 250;
               break;
            case 39:
               var10000 = 19;
               break;
            case 40:
               var10000 = 197;
               break;
            case 41:
               var10000 = 25;
               break;
            case 42:
               var10000 = 150;
               break;
            case 43:
               var10000 = 237;
               break;
            case 44:
               var10000 = 131;
               break;
            case 45:
               var10000 = 77;
               break;
            case 46:
               var10000 = 147;
               break;
            case 47:
               var10000 = 80;
               break;
            case 48:
               var10000 = 2;
               break;
            case 49:
               var10000 = 122;
               break;
            case 50:
               var10000 = 88;
               break;
            case 51:
               var10000 = 110;
               break;
            case 52:
               var10000 = 100;
               break;
            case 53:
               var10000 = 37;
               break;
            case 54:
               var10000 = 115;
               break;
            case 55:
               var10000 = 68;
               break;
            case 56:
               var10000 = 73;
               break;
            case 57:
               var10000 = 39;
               break;
            case 58:
               var10000 = 102;
               break;
            case 59:
               var10000 = 45;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 48;
               break;
            case 62:
               var10000 = 128;
               break;
            case 63:
               var10000 = 4;
               break;
            case 64:
               var10000 = 141;
               break;
            case 65:
               var10000 = 177;
               break;
            case 66:
               var10000 = 1;
               break;
            case 67:
               var10000 = 201;
               break;
            case 68:
               var10000 = 32;
               break;
            case 69:
               var10000 = 152;
               break;
            case 70:
               var10000 = 253;
               break;
            case 71:
               var10000 = 160;
               break;
            case 72:
               var10000 = 8;
               break;
            case 73:
               var10000 = 57;
               break;
            case 74:
               var10000 = 236;
               break;
            case 75:
               var10000 = 52;
               break;
            case 76:
               var10000 = 245;
               break;
            case 77:
               var10000 = 230;
               break;
            case 78:
               var10000 = 232;
               break;
            case 79:
               var10000 = 23;
               break;
            case 80:
               var10000 = 62;
               break;
            case 81:
               var10000 = 176;
               break;
            case 82:
               var10000 = 214;
               break;
            case 83:
               var10000 = 66;
               break;
            case 84:
               var10000 = 208;
               break;
            case 85:
               var10000 = 194;
               break;
            case 86:
               var10000 = 188;
               break;
            case 87:
               var10000 = 195;
               break;
            case 88:
               var10000 = 140;
               break;
            case 89:
               var10000 = 129;
               break;
            case 90:
               var10000 = 221;
               break;
            case 91:
               var10000 = 210;
               break;
            case 92:
               var10000 = 85;
               break;
            case 93:
               var10000 = 187;
               break;
            case 94:
               var10000 = 244;
               break;
            case 95:
               var10000 = 91;
               break;
            case 96:
               var10000 = 113;
               break;
            case 97:
               var10000 = 206;
               break;
            case 98:
               var10000 = 238;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 83;
               break;
            case 101:
               var10000 = 203;
               break;
            case 102:
               var10000 = 159;
               break;
            case 103:
               var10000 = 47;
               break;
            case 104:
               var10000 = 173;
               break;
            case 105:
               var10000 = 166;
               break;
            case 106:
               var10000 = 179;
               break;
            case 107:
               var10000 = 172;
               break;
            case 108:
               var10000 = 125;
               break;
            case 109:
               var10000 = 233;
               break;
            case 110:
               var10000 = 212;
               break;
            case 111:
               var10000 = 54;
               break;
            case 112:
               var10000 = 216;
               break;
            case 113:
               var10000 = 155;
               break;
            case 114:
               var10000 = 72;
               break;
            case 115:
               var10000 = 49;
               break;
            case 116:
               var10000 = 192;
               break;
            case 117:
               var10000 = 130;
               break;
            case 118:
               var10000 = 126;
               break;
            case 119:
               var10000 = 196;
               break;
            case 120:
               var10000 = 222;
               break;
            case 121:
               var10000 = 89;
               break;
            case 122:
               var10000 = 46;
               break;
            case 123:
               var10000 = 76;
               break;
            case 124:
               var10000 = 146;
               break;
            case 125:
               var10000 = 36;
               break;
            case 126:
               var10000 = 234;
               break;
            case 127:
               var10000 = 157;
               break;
            case 128:
               var10000 = 41;
               break;
            case 129:
               var10000 = 243;
               break;
            case 130:
               var10000 = 56;
               break;
            case 131:
               var10000 = 167;
               break;
            case 132:
               var10000 = 123;
               break;
            case 133:
               var10000 = 53;
               break;
            case 134:
               var10000 = 42;
               break;
            case 135:
               var10000 = 120;
               break;
            case 136:
               var10000 = 118;
               break;
            case 137:
               var10000 = 5;
               break;
            case 138:
               var10000 = 127;
               break;
            case 139:
               var10000 = 55;
               break;
            case 140:
               var10000 = 92;
               break;
            case 141:
               var10000 = 59;
               break;
            case 142:
               var10000 = 79;
               break;
            case 143:
               var10000 = 107;
               break;
            case 144:
               var10000 = 86;
               break;
            case 145:
               var10000 = 231;
               break;
            case 146:
               var10000 = 164;
               break;
            case 147:
               var10000 = 40;
               break;
            case 148:
               var10000 = 190;
               break;
            case 149:
               var10000 = 69;
               break;
            case 150:
               var10000 = 252;
               break;
            case 151:
               var10000 = 13;
               break;
            case 152:
               var10000 = 151;
               break;
            case 153:
               var10000 = 21;
               break;
            case 154:
               var10000 = 22;
               break;
            case 155:
               var10000 = 7;
               break;
            case 156:
               var10000 = 219;
               break;
            case 157:
               var10000 = 51;
               break;
            case 158:
               var10000 = 3;
               break;
            case 159:
               var10000 = 31;
               break;
            case 160:
               var10000 = 101;
               break;
            case 161:
               var10000 = 224;
               break;
            case 162:
               var10000 = 220;
               break;
            case 163:
               var10000 = 61;
               break;
            case 164:
               var10000 = 154;
               break;
            case 165:
               var10000 = 139;
               break;
            case 166:
               var10000 = 223;
               break;
            case 167:
               var10000 = 211;
               break;
            case 168:
               var10000 = 6;
               break;
            case 169:
               var10000 = 183;
               break;
            case 170:
               var10000 = 163;
               break;
            case 171:
               var10000 = 63;
               break;
            case 172:
               var10000 = 249;
               break;
            case 173:
               var10000 = 251;
               break;
            case 174:
               var10000 = 191;
               break;
            case 175:
               var10000 = 27;
               break;
            case 176:
               var10000 = 169;
               break;
            case 177:
               var10000 = 81;
               break;
            case 178:
               var10000 = 112;
               break;
            case 179:
               var10000 = 60;
               break;
            case 180:
               var10000 = 174;
               break;
            case 181:
               var10000 = 242;
               break;
            case 182:
               var10000 = 135;
               break;
            case 183:
               var10000 = 218;
               break;
            case 184:
               var10000 = 50;
               break;
            case 185:
               var10000 = 138;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 43;
               break;
            case 188:
               var10000 = 225;
               break;
            case 189:
               var10000 = 144;
               break;
            case 190:
               var10000 = 119;
               break;
            case 191:
               var10000 = 215;
               break;
            case 192:
               var10000 = 217;
               break;
            case 193:
               var10000 = 87;
               break;
            case 194:
               var10000 = 241;
               break;
            case 195:
               var10000 = 28;
               break;
            case 196:
               var10000 = 90;
               break;
            case 197:
               var10000 = 162;
               break;
            case 198:
               var10000 = 116;
               break;
            case 199:
               var10000 = 226;
               break;
            case 200:
               var10000 = 64;
               break;
            case 201:
               var10000 = 15;
               break;
            case 202:
               var10000 = 33;
               break;
            case 203:
               var10000 = 168;
               break;
            case 204:
               var10000 = 121;
               break;
            case 205:
               var10000 = 44;
               break;
            case 206:
               var10000 = 14;
               break;
            case 207:
               var10000 = 12;
               break;
            case 208:
               var10000 = 75;
               break;
            case 209:
               var10000 = 104;
               break;
            case 210:
               var10000 = 184;
               break;
            case 211:
               var10000 = 136;
               break;
            case 212:
               var10000 = 227;
               break;
            case 213:
               var10000 = 255;
               break;
            case 214:
               var10000 = 182;
               break;
            case 215:
               var10000 = 165;
               break;
            case 216:
               var10000 = 142;
               break;
            case 217:
               var10000 = 103;
               break;
            case 218:
               var10000 = 117;
               break;
            case 219:
               var10000 = 153;
               break;
            case 220:
               var10000 = 67;
               break;
            case 221:
               var10000 = 108;
               break;
            case 222:
               var10000 = 78;
               break;
            case 223:
               var10000 = 20;
               break;
            case 224:
               var10000 = 134;
               break;
            case 225:
               var10000 = 11;
               break;
            case 226:
               var10000 = 246;
               break;
            case 227:
               var10000 = 29;
               break;
            case 228:
               var10000 = 145;
               break;
            case 229:
               var10000 = 200;
               break;
            case 230:
               var10000 = 202;
               break;
            case 231:
               var10000 = 180;
               break;
            case 232:
               var10000 = 109;
               break;
            case 233:
               var10000 = 248;
               break;
            case 234:
               var10000 = 228;
               break;
            case 235:
               var10000 = 158;
               break;
            case 236:
               var10000 = 114;
               break;
            case 237:
               var10000 = 132;
               break;
            case 238:
               var10000 = 105;
               break;
            case 239:
               var10000 = 205;
               break;
            case 240:
               var10000 = 34;
               break;
            case 241:
               var10000 = 189;
               break;
            case 242:
               var10000 = 254;
               break;
            case 243:
               var10000 = 0;
               break;
            case 244:
               var10000 = 213;
               break;
            case 245:
               var10000 = 171;
               break;
            case 246:
               var10000 = 161;
               break;
            case 247:
               var10000 = 94;
               break;
            case 248:
               var10000 = 229;
               break;
            case 249:
               var10000 = 175;
               break;
            case 250:
               var10000 = 58;
               break;
            case 251:
               var10000 = 137;
               break;
            case 252:
               var10000 = 185;
               break;
            case 253:
               var10000 = 65;
               break;
            case 254:
               var10000 = 148;
               break;
            default:
               var10000 = 247;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "§ó\u000eÄ\u0004\u0000KòO\u0004\u0089\u009f\u008aÜ\u0004WÇ\u0010B\u0006\u008c}\u008d\u0015æ7\u0005hj+f\u000b\u0004ù¯\u0084Ú\u0004\u0007³\u0012P";
      int var4 = "§ó\u000eÄ\u0004\u0000KòO\u0004\u0089\u009f\u008aÜ\u0004WÇ\u0010B\u0006\u008c}\u008d\u0015æ7\u0005hj+f\u000b\u0004ù¯\u0084Ú\u0004\u0007³\u0012P"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 121;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 122;
                        break;
                     case 1:
                        var46 = 25;
                        break;
                     case 2:
                        var46 = 100;
                        break;
                     case 3:
                        var46 = 114;
                        break;
                     case 4:
                        var46 = 75;
                        break;
                     case 5:
                        var46 = 5;
                        break;
                     default:
                        var46 = 17;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     d = new String[10];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "¹¹:\u009c\u0001\u0017\u0005\u0089;\u0006]¿";
                  var4 = "¹¹:\u009c\u0001\u0017\u0005\u0089;\u0006]¿".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 35;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





