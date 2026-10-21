package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class R0 implements Pc4 {
   public static com.finalshell.ui.model.Rv2 e;
   public Map z;
   public Insets I;
   public int s;
   public int P;
   public Insets l;
   public Insets b;
   public Insets G;
   public Rectangle i;
   public boolean x;
   public List u;
   public Dimension w;
   public List t;
   public Dimension C;
   public Dimension V;
   public Rectangle q;
   public boolean Q;
   public List S;
   public Dimension j;
   public List a;
   public Dimension k;
   public Dimension N;
   public Rectangle L;
   public boolean H;
   public List o;
   public Dimension T;
   public List A;
   public Dimension M;
   public Dimension O;
   public Rectangle p;
   public boolean K;
   public List B;
   public Dimension d;
   public List Z;
   public Dimension J;
   public Dimension f;
   public Rectangle c;
   public Component r;
   public Rectangle m;
   public Component n;
   public Rectangle U;
   public Component R;
   public Rectangle v;
   public Component y;
   public Rectangle W;
   public Component Y;
   public Rectangle g;
   public static String[] h;
   public static String[] D;

   public R0(Tc2_2 var1, Container var2) {
      this.z = var1.c();
      this.I = var1.B();
      this.s = var1.F();
      int var10000 = com.finalshell.ui.panel.Ku4.W();
      this.P = var1.L();
      this.l = var1.a();
      this.b = var1.M();
      this.G = var2.getInsets();
      this.i = new Rectangle(this.G.left, this.G.top, var2.getWidth() - this.G.left - this.G.right, var2.getHeight() - this.G.top - this.G.bottom);
      this.u = new ArrayList(2);
      int var3 = var10000;
      this.t = new ArrayList(2);
      this.S = new ArrayList(2);
      this.a = new ArrayList(2);
      this.o = new ArrayList(2);
      this.A = new ArrayList(2);
      this.B = new ArrayList(2);
      this.Z = new ArrayList(2);
      this.r = null;
      this.n = null;
      this.R = null;
      this.y = null;
      this.Y = null;
      Iterator var4 = this.z.keySet().iterator();

      while (true) {
         if (var4.hasNext()) {
            Component var5 = (Component)var4.next();
            var10000 = (((String)this.z.get(var5)).equals(a(-16989, 21596))) ? 1 : 0;
            if (var3 == 0) {
               break;
            }

            label407: {
               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.u.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }

                     Ky4.K(new String[4]);
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16987, 31288))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.t.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16974, -20410))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.S.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16992, -21193))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.a.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16979, 20949))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.o.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16977, 15729))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.A.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16988, 18896))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.B.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16980, -16176))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.Z.add(var5);
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16986, 13625))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.r = var5;
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16983, 7013))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.n = var5;
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16985, 16815))) ? 1 : 0;
               }

               if (var3 != 0) {
                  if (var10000 != 0) {
                     this.R = var5;
                     if (var3 != 0) {
                        break label407;
                     }
                  }

                  var10000 = (((String)this.z.get(var5)).equals(a(-16984, 25975))) ? 1 : 0;
               }

               label408: {
                  if (var3 != 0) {
                     if (var10000 != 0) {
                        this.y = var5;
                        if (var3 != 0) {
                           break label407;
                        }
                     }

                     var11 = this;
                     if (var3 == 0) {
                        break label408;
                     }

                     var10000 = (((String)this.z.get(var5)).equals(a(-16991, -3198))) ? 1 : 0;
                  }

                  if (var10000 == 0) {
                     break label407;
                  }

                  var11 = this;
               }

               var11.Y = var5;
            }

            if (var3 != 0) {
               continue;
            }
         }

         Collections.sort(this.u, e);
         Collections.sort(this.t, e);
         Collections.sort(this.S, e);
         Collections.sort(this.a, e);
         Collections.sort(this.o, e);
         Collections.sort(this.A, e);
         Collections.sort(this.B, e);
         Collections.sort(this.Z, e);
         var10000 = this.u.size();
         break;
      }

      label325: {
         label410: {
            if (var3 != 0) {
               if (var10000 <= 0) {
                  break label410;
               }

               var10000 = this.t.size();
            }

            if (var3 == 0) {
               break label325;
            }

            if (var10000 > 0) {
      int var6;
      int var6;
      int var6;
      int var6;
               var10000 = 1;
               break label325;
            }
         }

         var10000 = 0;
      }

      int var10001;
      var6 = var10000;
      var10001 = this.u.size();
      label314:
      if (var3 != 0) {
         if (var10001 <= 0) {
            var10001 = this.t.size();
            if (var3 == 0) {
               break label314;
            }

            if (var10001 <= 0) {
               var10001 = 0;
               break label314;
            }
         }

         var10001 = 1;
      }

      label306: {
         this.x = (boolean)var10001;
         R0 var15 = this;
         if (var3 != 0) {
            if (!this.x) {
               var16 = new Dimension(0, 0);
               break label306;
            }

            var15 = this;
         }

         var16 = var15.T(a(-16982, -16577), this.u);
      }

      label300: {
         this.w = var16;
         R0 var17 = this;
         if (var3 != 0) {
            if (!this.x) {
               var18 = new Dimension(0, 0);
               break label300;
            }

            var17 = this;
         }

         var18 = var17.T(a(-16971, 30014), this.t);
      }

      label293: {
         label411: {
            this.C = var18;
            this.V = this.x
               ? new Dimension(this.w.width + (var6 != 0 ? this.P : 0) + this.C.width, Math.max(this.w.height, this.C.height))
               : new Dimension(0, 0);
            var10000 = this.S.size();
            if (var3 != 0) {
               if (var10000 <= 0) {
                  break label411;
               }

               var10000 = this.a.size();
            }

            if (var3 == 0) {
               break label293;
            }

            if (var10000 > 0) {
               var10000 = 1;
               break label293;
            }
         }

         var10000 = 0;
      }

      var7 = var10000;
      var10001 = this.S.size();
      label282:
      if (var3 != 0) {
         if (var10001 <= 0) {
            var10001 = this.a.size();
            if (var3 == 0) {
               break label282;
            }

            if (var10001 <= 0) {
               var10001 = 0;
               break label282;
            }
         }

         var10001 = 1;
      }

      label274: {
         this.Q = (boolean)var10001;
         R0 var20 = this;
         if (var3 != 0) {
            if (!this.Q) {
               var21 = new Dimension(0, 0);
               break label274;
            }

            var20 = this;
         }

         var21 = var20.T(a(-16990, -13908), this.S);
      }

      label268: {
         this.j = var21;
         R0 var22 = this;
         if (var3 != 0) {
            if (!this.Q) {
               var23 = new Dimension(0, 0);
               break label268;
            }

            var22 = this;
         }

         var23 = var22.T(a(-16973, -12397), this.a);
      }

      label261: {
         label412: {
            this.k = var23;
            this.N = this.Q
               ? new Dimension(Math.max(this.j.width, this.k.width), this.j.height + (var7 != 0 ? this.P : 0) + this.k.height)
               : new Dimension(0, 0);
            var10000 = this.o.size();
            if (var3 != 0) {
               if (var10000 <= 0) {
                  break label412;
               }

               var10000 = this.A.size();
            }

            if (var3 == 0) {
               break label261;
            }

            if (var10000 > 0) {
               var10000 = 1;
               break label261;
            }
         }

         var10000 = 0;
      }

      var8 = var10000;
      var10001 = this.o.size();
      label250:
      if (var3 != 0) {
         if (var10001 <= 0) {
            var10001 = this.A.size();
            if (var3 == 0) {
               break label250;
            }

            if (var10001 <= 0) {
               var10001 = 0;
               break label250;
            }
         }

         var10001 = 1;
      }

      label242: {
         this.H = (boolean)var10001;
         R0 var25 = this;
         if (var3 != 0) {
            if (!this.H) {
               var26 = new Dimension(0, 0);
               break label242;
            }

            var25 = this;
         }

         var26 = var25.T(a(-16990, -13908), this.o);
      }

      label236: {
         this.T = var26;
         R0 var27 = this;
         if (var3 != 0) {
            if (!this.H) {
               var28 = new Dimension(0, 0);
               break label236;
            }

            var27 = this;
         }

         var28 = var27.T(a(-16973, -12397), this.A);
      }

      label229: {
         label413: {
            this.M = var28;
            this.O = this.H
               ? new Dimension(Math.max(this.T.width, this.M.width), this.T.height + (var8 != 0 ? this.P : 0) + this.M.height)
               : new Dimension(0, 0);
            var10000 = this.B.size();
            if (var3 != 0) {
               if (var10000 <= 0) {
                  break label413;
               }

               var10000 = this.Z.size();
            }

            if (var3 == 0) {
               break label229;
            }

            if (var10000 > 0) {
               var10000 = 1;
               break label229;
            }
         }

         var10000 = 0;
      }

      var9 = var10000;
      var10001 = this.B.size();
      label218:
      if (var3 != 0) {
         if (var10001 <= 0) {
            var10001 = this.Z.size();
            if (var3 == 0) {
               break label218;
            }

            if (var10001 <= 0) {
               var10001 = 0;
               break label218;
            }
         }

         var10001 = 1;
      }

      label210: {
         this.K = (boolean)var10001;
         R0 var30 = this;
         if (var3 != 0) {
            if (!this.K) {
               var31 = new Dimension(0, 0);
               break label210;
            }

            var30 = this;
         }

         var31 = var30.T(a(-16978, -4747), this.B);
      }

      label204: {
         this.d = var31;
         R0 var32 = this;
         if (var3 != 0) {
            if (!this.K) {
               var33 = new Dimension(0, 0);
               break label204;
            }

            var32 = this;
         }

         var33 = var32.T(a(-16975, 14750), this.Z);
      }

      this.J = var33;
      this.f = this.K ? new Dimension(this.d.width + (var9 != 0 ? this.P : 0) + this.J.width, Math.max(this.d.height, this.J.height)) : new Dimension(0, 0);
      this.V();
   }

   public void V() {
      int var1 = com.finalshell.ui.panel.Ku4.H();
      this.q = this.x ? new Rectangle(this.i.x, this.i.y, this.i.width, this.I.top + this.V.height + this.I.bottom) : new Rectangle(0, 0);
      this.c = this.K
         ? new Rectangle(
            this.i.x, this.i.y + this.i.height - this.I.top - this.f.height - this.I.bottom, this.i.width, this.I.top + this.f.height + this.I.bottom
         )
         : new Rectangle(0, 0);
      this.L = this.Q
         ? new Rectangle(this.i.x, this.i.y + this.q.height, this.I.left + this.N.width + this.I.right, this.i.height - this.q.height - this.c.height)
         : new Rectangle(0, 0);
      this.p = this.H
         ? new Rectangle(
            this.i.x + this.i.width - this.I.left - this.O.width - this.I.right,
            this.i.y + this.q.height,
            this.I.left + this.O.width + this.I.right,
            this.i.height - this.q.height - this.c.height
         )
         : new Rectangle(0, 0);
      int var10000 = this.x;
      if (var1 == 0) {
         var10000 = this.x ? 1 : 0;
      }

      int var2 = ((((var10000 + this.l.top) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
      var10000 = this.Q;
      if (var1 == 0) {
         var10000 = this.Q ? 1 : 0;
      }

      int var3 = ((((var10000 + this.l.left) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
      var10000 = this.H;
      if (var1 == 0) {
         var10000 = this.H ? 1 : 0;
      }

      int var4 = ((((var10000 + this.l.right) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
      var10000 = this.K;
      if (var1 == 0) {
         var10000 = this.K ? 1 : 0;
      }

      int var5;
      label121: {
         var5 = var10000 + this.l.bottom;
         Component var14 = this.r;
         if (var1 == 0) {
            if (this.r == null) {
               var15 = null;
               break label121;
            }

            var14 = this.r;
         }

         var15 = var14.getPreferredSize();
      }

      label114: {
         Dimension var6 = var15;
         this.m = this.r != null
            ? new Rectangle(
               this.i.x + this.L.width + var3, this.i.y + this.q.height + var2, this.i.width - this.L.width - this.p.width - var3 - var4, var6.height
            )
            : new Rectangle(0, 0);
         Component var16 = this.y;
         if (var1 == 0) {
            if (this.y == null) {
               var17 = null;
               break label114;
            }

            var16 = this.y;
         }

         var17 = var16.getPreferredSize();
      }

      label107: {
         Dimension var7 = var17;
         this.W = this.y != null
            ? new Rectangle(
               this.i.x + this.L.width + var3,
               this.i.y + this.i.height - this.c.height - var5 - var7.height,
               this.i.width - this.L.width - this.p.width - var3 - var4,
               var7.height
            )
            : new Rectangle(0, 0);
         Component var18 = this.n;
         if (var1 == 0) {
            if (this.n == null) {
               var19 = null;
               break label107;
            }

            var18 = this.n;
         }

         var19 = var18.getPreferredSize();
      }

      label100: {
         Dimension var8 = var19;
         this.U = this.n != null
            ? new Rectangle(
               this.i.x + this.L.width + var3,
               this.i.y + this.q.height + var2 + this.m.height,
               var8.width,
               this.i.height - this.q.height - var2 - this.m.height - this.c.height - var5 - this.W.height
            )
            : new Rectangle(0, 0);
         Component var20 = this.R;
         if (var1 == 0) {
            if (this.R == null) {
               var21 = null;
               break label100;
            }

            var20 = this.R;
         }

         var21 = var20.getPreferredSize();
      }

      Dimension var9 = var21;
      this.v = this.R != null
         ? new Rectangle(
            this.i.x + this.i.width - this.p.width - var4 - var9.width,
            this.i.y + this.q.height + var2 + this.m.height,
            var9.width,
            this.i.height - this.q.height - var2 - this.m.height - this.c.height - var5 - this.W.height
         )
         : new Rectangle(0, 0);
      this.g = this.Y != null
         ? new Rectangle(
            this.i.x + this.L.width + var3 + this.U.width + this.b.left,
            this.i.y + this.q.height + var2 + this.m.height + this.b.top,
            this.i.width - this.L.width - this.p.width - var3 - var4 - this.U.width - this.v.width - this.b.left - this.b.right,
            this.i.height - this.q.height - this.c.height - var2 - var5 - this.m.height - this.W.height - this.b.top - this.b.bottom
         )
         : null;
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.Ku4.j(++var1);
      }
   }

   public Dimension T(String var1, List var2) {
      int var3;
      Dimension var4;
      label56: {
         label51: {
            int var10000 = com.finalshell.ui.panel.Ku4.W();
            var4 = new Dimension(0, 0);
            var3 = var10000;
            boolean var11 = var1.startsWith(a(-16981, 14678));
            if (var3 != 0) {
               if (var11) {
                  break label51;
               }

               var11 = var1.startsWith(a(-16976, 11366));
            }

            if (!var11) {
               break label56;
            }
         }

         for (Component var6 : var2) {
            Dimension var7 = var6.getPreferredSize();
            var4.width = var4.width + var7.width + this.s;
            var4.height = Math.max(var4.height, var7.height);
            if (var3 == 0) {
               return var4;
            }

            if (var3 == 0) {
               break;
            }
         }

         if (var2.size() <= 0) {
            return var4;
         }

         var4.width = var4.width - this.s;
         if (var3 != 0) {
            return var4;
         }
      }

      for (Component var9 : var2) {
         Dimension var10 = var9.getPreferredSize();
         var4.height = var4.height + var10.height + this.s;
         var4.width = Math.max(var4.width, var10.width);
         if (var3 == 0) {
            return var4;
         }

         if (var3 == 0) {
            break;
         }
      }

      if (var2.size() > 0) {
         var4.height = var4.height - this.s;
      }

      return var4;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -16991) & 65535;
      if (D[var2] == null) {
         char[] var3 = h[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 240;
               break;
            case 1:
               var10000 = 114;
               break;
            case 2:
               var10000 = 227;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 12;
               break;
            case 5:
               var10000 = 136;
               break;
            case 6:
               var10000 = 122;
               break;
            case 7:
               var10000 = 4;
               break;
            case 8:
               var10000 = 200;
               break;
            case 9:
               var10000 = 226;
               break;
            case 10:
               var10000 = 207;
               break;
            case 11:
               var10000 = 215;
               break;
            case 12:
               var10000 = 61;
               break;
            case 13:
               var10000 = 96;
               break;
            case 14:
               var10000 = 102;
               break;
            case 15:
               var10000 = 17;
               break;
            case 16:
               var10000 = 71;
               break;
            case 17:
               var10000 = 13;
               break;
            case 18:
               var10000 = 49;
               break;
            case 19:
               var10000 = 140;
               break;
            case 20:
               var10000 = 159;
               break;
            case 21:
               var10000 = 134;
               break;
            case 22:
               var10000 = 213;
               break;
            case 23:
               var10000 = 16;
               break;
            case 24:
               var10000 = 88;
               break;
            case 25:
               var10000 = 6;
               break;
            case 26:
               var10000 = 178;
               break;
            case 27:
               var10000 = 128;
               break;
            case 28:
               var10000 = 157;
               break;
            case 29:
               var10000 = 3;
               break;
            case 30:
               var10000 = 222;
               break;
            case 31:
               var10000 = 19;
               break;
            case 32:
               var10000 = 47;
               break;
            case 33:
               var10000 = 209;
               break;
            case 34:
               var10000 = 9;
               break;
            case 35:
               var10000 = 199;
               break;
            case 36:
               var10000 = 133;
               break;
            case 37:
               var10000 = 69;
               break;
            case 38:
               var10000 = 22;
               break;
            case 39:
               var10000 = 210;
               break;
            case 40:
               var10000 = 160;
               break;
            case 41:
               var10000 = 27;
               break;
            case 42:
               var10000 = 31;
               break;
            case 43:
               var10000 = 135;
               break;
            case 44:
               var10000 = 120;
               break;
            case 45:
               var10000 = 250;
               break;
            case 46:
               var10000 = 76;
               break;
            case 47:
               var10000 = 90;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 197;
               break;
            case 50:
               var10000 = 237;
               break;
            case 51:
               var10000 = 39;
               break;
            case 52:
               var10000 = 125;
               break;
            case 53:
               var10000 = 26;
               break;
            case 54:
               var10000 = 98;
               break;
            case 55:
               var10000 = 221;
               break;
            case 56:
               var10000 = 59;
               break;
            case 57:
               var10000 = 194;
               break;
            case 58:
               var10000 = 55;
               break;
            case 59:
               var10000 = 15;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 118;
               break;
            case 62:
               var10000 = 36;
               break;
            case 63:
               var10000 = 153;
               break;
            case 64:
               var10000 = 18;
               break;
            case 65:
               var10000 = 29;
               break;
            case 66:
               var10000 = 80;
               break;
            case 67:
               var10000 = 144;
               break;
            case 68:
               var10000 = 37;
               break;
            case 69:
               var10000 = 171;
               break;
            case 70:
               var10000 = 190;
               break;
            case 71:
               var10000 = 92;
               break;
            case 72:
               var10000 = 208;
               break;
            case 73:
               var10000 = 113;
               break;
            case 74:
               var10000 = 214;
               break;
            case 75:
               var10000 = 234;
               break;
            case 76:
               var10000 = 183;
               break;
            case 77:
               var10000 = 112;
               break;
            case 78:
               var10000 = 106;
               break;
            case 79:
               var10000 = 169;
               break;
            case 80:
               var10000 = 20;
               break;
            case 81:
               var10000 = 252;
               break;
            case 82:
               var10000 = 198;
               break;
            case 83:
               var10000 = 116;
               break;
            case 84:
               var10000 = 45;
               break;
            case 85:
               var10000 = 124;
               break;
            case 86:
               var10000 = 32;
               break;
            case 87:
               var10000 = 103;
               break;
            case 88:
               var10000 = 28;
               break;
            case 89:
               var10000 = 236;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 220;
               break;
            case 92:
               var10000 = 195;
               break;
            case 93:
               var10000 = 129;
               break;
            case 94:
               var10000 = 89;
               break;
            case 95:
               var10000 = 253;
               break;
            case 96:
               var10000 = 163;
               break;
            case 97:
               var10000 = 138;
               break;
            case 98:
               var10000 = 72;
               break;
            case 99:
               var10000 = 205;
               break;
            case 100:
               var10000 = 224;
               break;
            case 101:
               var10000 = 63;
               break;
            case 102:
               var10000 = 64;
               break;
            case 103:
               var10000 = 189;
               break;
            case 104:
               var10000 = 249;
               break;
            case 105:
               var10000 = 35;
               break;
            case 106:
               var10000 = 84;
               break;
            case 107:
               var10000 = 34;
               break;
            case 108:
               var10000 = 73;
               break;
            case 109:
               var10000 = 58;
               break;
            case 110:
               var10000 = 94;
               break;
            case 111:
               var10000 = 182;
               break;
            case 112:
               var10000 = 74;
               break;
            case 113:
               var10000 = 14;
               break;
            case 114:
               var10000 = 162;
               break;
            case 115:
               var10000 = 248;
               break;
            case 116:
               var10000 = 142;
               break;
            case 117:
               var10000 = 79;
               break;
            case 118:
               var10000 = 57;
               break;
            case 119:
               var10000 = 242;
               break;
            case 120:
               var10000 = 204;
               break;
            case 121:
               var10000 = 10;
               break;
            case 122:
               var10000 = 132;
               break;
            case 123:
               var10000 = 99;
               break;
            case 124:
               var10000 = 202;
               break;
            case 125:
               var10000 = 50;
               break;
            case 126:
               var10000 = 147;
               break;
            case 127:
               var10000 = 180;
               break;
            case 128:
               var10000 = 95;
               break;
            case 129:
               var10000 = 105;
               break;
            case 130:
               var10000 = 243;
               break;
            case 131:
               var10000 = 225;
               break;
            case 132:
               var10000 = 75;
               break;
            case 133:
               var10000 = 191;
               break;
            case 134:
               var10000 = 192;
               break;
            case 135:
               var10000 = 216;
               break;
            case 136:
               var10000 = 56;
               break;
            case 137:
               var10000 = 87;
               break;
            case 138:
               var10000 = 158;
               break;
            case 139:
               var10000 = 211;
               break;
            case 140:
               var10000 = 5;
               break;
            case 141:
               var10000 = 219;
               break;
            case 142:
               var10000 = 188;
               break;
            case 143:
               var10000 = 2;
               break;
            case 144:
               var10000 = 167;
               break;
            case 145:
               var10000 = 254;
               break;
            case 146:
               var10000 = 176;
               break;
            case 147:
               var10000 = 238;
               break;
            case 148:
               var10000 = 141;
               break;
            case 149:
               var10000 = 77;
               break;
            case 150:
               var10000 = 121;
               break;
            case 151:
               var10000 = 185;
               break;
            case 152:
               var10000 = 145;
               break;
            case 153:
               var10000 = 150;
               break;
            case 154:
               var10000 = 1;
               break;
            case 155:
               var10000 = 21;
               break;
            case 156:
               var10000 = 65;
               break;
            case 157:
               var10000 = 139;
               break;
            case 158:
               var10000 = 101;
               break;
            case 159:
               var10000 = 111;
               break;
            case 160:
               var10000 = 177;
               break;
            case 161:
               var10000 = 155;
               break;
            case 162:
               var10000 = 166;
               break;
            case 163:
               var10000 = 148;
               break;
            case 164:
               var10000 = 62;
               break;
            case 165:
               var10000 = 78;
               break;
            case 166:
               var10000 = 123;
               break;
            case 167:
               var10000 = 119;
               break;
            case 168:
               var10000 = 245;
               break;
            case 169:
               var10000 = 66;
               break;
            case 170:
               var10000 = 44;
               break;
            case 171:
               var10000 = 203;
               break;
            case 172:
               var10000 = 53;
               break;
            case 173:
               var10000 = 42;
               break;
            case 174:
               var10000 = 218;
               break;
            case 175:
               var10000 = 115;
               break;
            case 176:
               var10000 = 193;
               break;
            case 177:
               var10000 = 110;
               break;
            case 178:
               var10000 = 43;
               break;
            case 179:
               var10000 = 174;
               break;
            case 180:
               var10000 = 0;
               break;
            case 181:
               var10000 = 41;
               break;
            case 182:
               var10000 = 231;
               break;
            case 183:
               var10000 = 107;
               break;
            case 184:
               var10000 = 100;
               break;
            case 185:
               var10000 = 246;
               break;
            case 186:
               var10000 = 161;
               break;
            case 187:
               var10000 = 229;
               break;
            case 188:
               var10000 = 251;
               break;
            case 189:
               var10000 = 54;
               break;
            case 190:
               var10000 = 83;
               break;
            case 191:
               var10000 = 241;
               break;
            case 192:
               var10000 = 164;
               break;
            case 193:
               var10000 = 51;
               break;
            case 194:
               var10000 = 67;
               break;
            case 195:
               var10000 = 206;
               break;
            case 196:
               var10000 = 11;
               break;
            case 197:
               var10000 = 173;
               break;
            case 198:
               var10000 = 175;
               break;
            case 199:
               var10000 = 81;
               break;
            case 200:
               var10000 = 223;
               break;
            case 201:
               var10000 = 232;
               break;
            case 202:
               var10000 = 23;
               break;
            case 203:
               var10000 = 170;
               break;
            case 204:
               var10000 = 104;
               break;
            case 205:
               var10000 = 86;
               break;
            case 206:
               var10000 = 156;
               break;
            case 207:
               var10000 = 52;
               break;
            case 208:
               var10000 = 82;
               break;
            case 209:
               var10000 = 154;
               break;
            case 210:
               var10000 = 8;
               break;
            case 211:
               var10000 = 230;
               break;
            case 212:
               var10000 = 165;
               break;
            case 213:
               var10000 = 187;
               break;
            case 214:
               var10000 = 184;
               break;
            case 215:
               var10000 = 244;
               break;
            case 216:
               var10000 = 24;
               break;
            case 217:
               var10000 = 137;
               break;
            case 218:
               var10000 = 25;
               break;
            case 219:
               var10000 = 196;
               break;
            case 220:
               var10000 = 48;
               break;
            case 221:
               var10000 = 217;
               break;
            case 222:
               var10000 = 130;
               break;
            case 223:
               var10000 = 179;
               break;
            case 224:
               var10000 = 70;
               break;
            case 225:
               var10000 = 40;
               break;
            case 226:
               var10000 = 126;
               break;
            case 227:
               var10000 = 212;
               break;
            case 228:
               var10000 = 235;
               break;
            case 229:
               var10000 = 233;
               break;
            case 230:
               var10000 = 143;
               break;
            case 231:
               var10000 = 117;
               break;
            case 232:
               var10000 = 201;
               break;
            case 233:
               var10000 = 93;
               break;
            case 234:
               var10000 = 108;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 168;
               break;
            case 237:
               var10000 = 239;
               break;
            case 238:
               var10000 = 46;
               break;
            case 239:
               var10000 = 152;
               break;
            case 240:
               var10000 = 30;
               break;
            case 241:
               var10000 = 38;
               break;
            case 242:
               var10000 = 149;
               break;
            case 243:
               var10000 = 127;
               break;
            case 244:
               var10000 = 68;
               break;
            case 245:
               var10000 = 7;
               break;
            case 246:
               var10000 = 97;
               break;
            case 247:
               var10000 = 60;
               break;
            case 248:
               var10000 = 109;
               break;
            case 249:
               var10000 = 181;
               break;
            case 250:
               var10000 = 131;
               break;
            case 251:
               var10000 = 247;
               break;
            case 252:
               var10000 = 91;
               break;
            case 253:
               var10000 = 85;
               break;
            case 254:
               var10000 = 172;
               break;
            default:
               var10000 = 146;
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

         D[var2] = new String(var3).intern();
      }

      return D[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "\u001fð5o\u001b¸b\u000b4Ó¶@xQLqå\f¬\b\tz\u001c5ê\u0092fî\b\u0015I\u0092\u0013ü-Ü.\tÍä\u0084æçä\u001b±\u0006\u000bý\u0019RR¤\u001cÕ.Õõ\u0080\u000b\u009eg?Gc3L\u0085ØV´\t\u000f`Üvøíhí¿\n\u0095²\u0082lþÐ\u0081Ðû\u0085\fÞM6Ø(MD\u000eð½Èä\u0003ó¿C\b¨C(\u0012lv¶r\tA®Ä~\u001c\u0014±|&\fý\u0090Rc¤:ÕôÙr\u0090Ê\fJÕ¥\u00110ù\"Á\u0084y\u0082Ã\u000bî+0\u0014èÔ\\7äÖ¦\fàxñ~Ð\u0099[\u0080\büª\u001b\u0006hßà\u008aò\u0007\u000bÉü\t¥\u008fí²æ:þW";
      int var4 = "\u001fð5o\u001b¸b\u000b4Ó¶@xQLqå\f¬\b\tz\u001c5ê\u0092fî\b\u0015I\u0092\u0013ü-Ü.\tÍä\u0084æçä\u001b±\u0006\u000bý\u0019RR¤\u001cÕ.Õõ\u0080\u000b\u009eg?Gc3L\u0085ØV´\t\u000f`Üvøíhí¿\n\u0095²\u0082lþÐ\u0081Ðû\u0085\fÞM6Ø(MD\u000eð½Èä\u0003ó¿C\b¨C(\u0012lv¶r\tA®Ä~\u001c\u0014±|&\fý\u0090Rc¤:ÕôÙr\u0090Ê\fJÕ¥\u00110ù\"Á\u0084y\u0082Ã\u000bî+0\u0014èÔ\\7äÖ¦\fàxñ~Ð\u0099[\u0080\büª\u001b\u0006hßà\u008aò\u0007\u000bÉü\t¥\u008fí²æ:þW"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 122;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 119;
                        break;
                     case 1:
                        var46 = 7;
                        break;
                     case 2:
                        var46 = 104;
                        break;
                     case 3:
                        var46 = 86;
                        break;
                     case 4:
                        var46 = 71;
                        break;
                     case 5:
                        var46 = 58;
                        break;
                     default:
                        var46 = 101;
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
                     h = var5;
                     D = new String[21];
                     e = new com.finalshell.ui.model.Rv2();
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

                  var2 = "ðçH Á=\u001dJ\t\f¾ÚËJ'È¯\u001a";
                  var4 = "ðçH Á=\u001dJ\t\f¾ÚËJ'È¯\u001a".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 88;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





