
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 10 13:06:13 COT 2015
//----------------------------------------------------

package compiladorconjuntos;

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 10 13:06:13 COT 2015
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\003\000\002\003\003\000\002\002\004\000\002\002" +
    "\012" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\005\006\001\002\000\004\002\001\001" +
    "\002\000\004\002\016\001\002\000\004\011\007\001\002" +
    "\000\004\006\010\001\002\000\004\010\011\001\002\000" +
    "\004\005\012\001\002\000\004\011\013\001\002\000\004" +
    "\006\014\001\002\000\004\007\015\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   public void report_error(String mensaje, Object info) {
       	StringBuffer m = new StringBuffer("error");
		//System.out.println("info: "+info.toString());
                //System.out.println(Integer.parseInt(info.toString()));
                char a=info.toString().charAt(1);
                String msj="";
                switch (a){
                    case '1':
                        msj="Caracter no valido";
                        break;
                    case '7': 
                        msj= "Elemeno no valido en esa posicion";
                        break;
                    case '5': 
                        msj= "; solo en fin de linea";
                        break;
                    case '6': 
                        msj= "solo entre dos conjuntos";
                        break;
                    case '0': 
                        msj= "falta fin de linea";
                        break;
                    case '3': 
                        msj= "al inicio de un conjunto";
                        break;
                    case '4': 
                        msj= "al final del conjunto";
                        break;
                    default:
                        System.out.println(a);
                        msj="verifique sintaxis";
                        break;
                }
		if(info instanceof java_cup.runtime.Symbol) {
			java_cup.runtime.Symbol s=((java_cup.runtime.Symbol)info);
			/* Comprueba si el numero de línea es mayor o igual que cero */
			if(s.left >= 0) {
				m.append(" en linea "+(s.left+1));
				/*Comprueba si el numero de columna es mayoro igual que cero */
				if (s.right >= 0)
					m.append(", y columna "+(s.right+1));
			}
		}
		m.append(" : "+msj);
		System.out.println(m);
                
    }
    public void report_fatal_error(String message, Object info) {
        try{
       	report_error(message, info);
        }
        catch(Exception e){

        }
    }
    
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sentencia ::= INICIO ELEMENTO FINC UNION INICIO ELEMENTO FINC FINLINEA 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		 RESULT = "LA union del conjunto: ("+n+n1+")";
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("sentencia",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= resultado EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // resultado ::= sentencia 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
	System.out.println(e);

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("resultado",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

