package compiladorconjuntos;
import java_cup.runtime.*;
%% 
%class Lexico
%cup
%line
%char
%column
%{
  private Symbol symbol(int type){
    return new Symbol(type,yyline,yycolumn);
  }

  private Symbol symbol(int type,Object value){
    return new Symbol(type,yyline,yycolumn,value);
  }
%}
NUMBER = [1-9][0-9]*[A-Za-z]*
LETRA= [A-Za-z][A-Za-z]*[0-9]*
Operador= [+]
Inicio= [(]
Fin= [)]
FinLinea= [;]
ENTER=[\n]
%%
<YYINITIAL> {
{NUMBER} { return new Symbol(sym.ELEMENTO, yychar, yyline, yytext()); }
{LETRA} { return new Symbol(sym.ELEMENTO,yychar, yyline, yytext()); }
{Operador} { return new Symbol(sym.UNION, yychar, yyline, yytext()); }
{Inicio} { return new Symbol(sym.INICIO, yychar, yyline, yytext()); }
{Fin} { return new Symbol(sym.FINC, yychar, yyline, yytext()); }
{FinLinea} { return new Symbol(sym.FINLINEA, yychar, yyline, yytext()); }
{ENTER} { return new Symbol(sym.EOF, yychar, yyline, yytext());  }
(" "|\t|\r)+	{ }
. { return  new Symbol(sym.error, yychar, yyline, yytext()); }
}