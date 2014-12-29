package net.mlanoe.language.vhdl.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVhdlLexer extends Lexer {
    public static final int Sra=103;
    public static final int RULE_ID=148;
    public static final int Tolerance=15;
    public static final int RightParenthesis=124;
    public static final int Array=54;
    public static final int After=52;
    public static final int Group=59;
    public static final int Srl=104;
    public static final int LeftParenthesis=123;
    public static final int RightSquareBracket=137;
    public static final int Library=29;
    public static final int Solidus=130;
    public static final int Elsif=58;
    public static final int EOF=-1;
    public static final int Attribute=9;
    public static final int EqualsSignEqualsSign=112;
    public static final int Bus=89;
    public static final int RULE_BIT_STRING_LITERAL=145;
    public static final int FullStop=129;
    public static final int Xor=106;
    public static final int Reject=46;
    public static final int Through=35;
    public static final int Out=97;
    public static final int Rol=99;
    public static final int Variable=26;
    public static final int Signal=51;
    public static final int To=121;
    public static final int Register=22;
    public static final int Linkage=30;
    public static final int Across=37;
    public static final int Xnor=85;
    public static final int LessThanSign=133;
    public static final int Disconnect=6;
    public static final int Pure=79;
    public static final int Nature=43;
    public static final int When=83;
    public static final int Port=78;
    public static final int RULE_CHAR=150;
    public static final int Transport=16;
    public static final int Ror=100;
    public static final int Access=36;
    public static final int Inertial=20;
    public static final int Use=105;
    public static final int Limit=62;
    public static final int Null=76;
    public static final int Mod=93;
    public static final int Others=44;
    public static final int Abs=86;
    public static final int RULE_LETTER_OR_DIGIT_FRAGMENT=147;
    public static final int ColonEqualsSign=109;
    public static final int Subnature=14;
    public static final int LessThanSignEqualsSign=110;
    public static final int Colon=131;
    public static final int RULE_EXTENDED_IDENTIFIER=149;
    public static final int With=84;
    public static final int Block=56;
    public static final int Range=64;
    public static final int RULE_STRING=144;
    public static final int Break=57;
    public static final int Function=18;
    public static final int VerticalLine=138;
    public static final int Inout=60;
    public static final int Guarded=28;
    public static final int Next=75;
    public static final int On=119;
    public static final int Else=70;
    public static final int Wait=82;
    public static final int Label=61;
    public static final int Of=118;
    public static final int Generate=19;
    public static final int Loop=73;
    public static final int End=90;
    public static final int Exit=71;
    public static final int Open=77;
    public static final int HyphenMinus=128;
    public static final int Architecture=5;
    public static final int All=87;
    public static final int Assert=38;
    public static final int Constant=17;
    public static final int Severity=23;
    public static final int Nand=74;
    public static final int While=67;
    public static final int LessThanSignGreaterThanSign=111;
    public static final int Process=33;
    public static final int Case=69;
    public static final int GreaterThanSign=135;
    public static final int Component=10;
    public static final int Begin=55;
    public static final int RULE_INTEGER_FRAGMENT=139;
    public static final int Body=68;
    public static final int Literal=31;
    public static final int Terminal=25;
    public static final int RULE_EXPONENT_FRAGMENT=141;
    public static final int Map=92;
    public static final int RULE_DIGIT_FRAGMENT=154;
    public static final int Spectrum=24;
    public static final int EqualsSignGreaterThanSign=113;
    public static final int RULE_ABSTRACT_LITERAL=142;
    public static final int Subtype=34;
    public static final int Select=49;
    public static final int AsteriskAsterisk=107;
    public static final int LeftSquareBracket=136;
    public static final int Or=120;
    public static final int Return=48;
    public static final int Noise=63;
    public static final int RULE_LETTER_FRAGMENT=146;
    public static final int Downto=40;
    public static final int Reference=13;
    public static final int If=115;
    public static final int RULE_BASED_INTEGER_FRAGMENT=140;
    public static final int And=88;
    public static final int Entity=41;
    public static final int Asterisk=125;
    public static final int RULE_BASE_SPECIFIER_FRAGMENT=143;
    public static final int In=116;
    public static final int Type=81;
    public static final int Sla=101;
    public static final int Then=80;
    public static final int Report=47;
    public static final int Procedure=12;
    public static final int RULE_ATTRIBUTE=151;
    public static final int Buffer=39;
    public static final int Is=117;
    public static final int SolidusEqualsSign=108;
    public static final int Units=65;
    public static final int Semicolon=132;
    public static final int RULE_SL_COMMENT=152;
    public static final int For=91;
    public static final int Package=32;
    public static final int Sll=102;
    public static final int Ampersand=122;
    public static final int Quantity=21;
    public static final int Shared=50;
    public static final int PlusSign=126;
    public static final int Unaffected=8;
    public static final int File=72;
    public static final int Rem=98;
    public static final int New=94;
    public static final int Configuration=4;
    public static final int Nor=95;
    public static final int Not=96;
    public static final int GreaterThanSignEqualsSign=114;
    public static final int Impure=42;
    public static final int Record=45;
    public static final int Alias=53;
    public static final int RULE_WS=153;
    public static final int Generic=27;
    public static final int Procedural=7;
    public static final int EqualsSign=134;
    public static final int Comma=127;
    public static final int Until=66;
    public static final int Postponed=11;

    // delegates
    // delegators

    public InternalVhdlLexer() {;} 
    public InternalVhdlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVhdlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g"; }

    // $ANTLR start "Configuration"
    public final void mConfiguration() throws RecognitionException {
        try {
            int _type = Configuration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:19:15: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:19:17: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Configuration"

    // $ANTLR start "Architecture"
    public final void mArchitecture() throws RecognitionException {
        try {
            int _type = Architecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:21:14: ( ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:21:16: ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Architecture"

    // $ANTLR start "Disconnect"
    public final void mDisconnect() throws RecognitionException {
        try {
            int _type = Disconnect;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:23:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:23:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Disconnect"

    // $ANTLR start "Procedural"
    public final void mProcedural() throws RecognitionException {
        try {
            int _type = Procedural;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:25:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:25:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Procedural"

    // $ANTLR start "Unaffected"
    public final void mUnaffected() throws RecognitionException {
        try {
            int _type = Unaffected;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:27:12: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:27:14: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Unaffected"

    // $ANTLR start "Attribute"
    public final void mAttribute() throws RecognitionException {
        try {
            int _type = Attribute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:29:11: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:29:13: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Attribute"

    // $ANTLR start "Component"
    public final void mComponent() throws RecognitionException {
        try {
            int _type = Component;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:31:11: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:31:13: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Component"

    // $ANTLR start "Postponed"
    public final void mPostponed() throws RecognitionException {
        try {
            int _type = Postponed;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:33:11: ( ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:33:13: ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Postponed"

    // $ANTLR start "Procedure"
    public final void mProcedure() throws RecognitionException {
        try {
            int _type = Procedure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:35:11: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:35:13: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Procedure"

    // $ANTLR start "Reference"
    public final void mReference() throws RecognitionException {
        try {
            int _type = Reference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:37:11: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:37:13: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reference"

    // $ANTLR start "Subnature"
    public final void mSubnature() throws RecognitionException {
        try {
            int _type = Subnature;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:39:11: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:39:13: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subnature"

    // $ANTLR start "Tolerance"
    public final void mTolerance() throws RecognitionException {
        try {
            int _type = Tolerance;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:41:11: ( ( 'T' | 't' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:41:13: ( 'T' | 't' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tolerance"

    // $ANTLR start "Transport"
    public final void mTransport() throws RecognitionException {
        try {
            int _type = Transport;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:43:11: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:43:13: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Transport"

    // $ANTLR start "Constant"
    public final void mConstant() throws RecognitionException {
        try {
            int _type = Constant;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:45:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:45:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constant"

    // $ANTLR start "Function"
    public final void mFunction() throws RecognitionException {
        try {
            int _type = Function;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:47:10: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:47:12: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Function"

    // $ANTLR start "Generate"
    public final void mGenerate() throws RecognitionException {
        try {
            int _type = Generate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:49:10: ( ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:49:12: ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Generate"

    // $ANTLR start "Inertial"
    public final void mInertial() throws RecognitionException {
        try {
            int _type = Inertial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:51:10: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:51:12: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inertial"

    // $ANTLR start "Quantity"
    public final void mQuantity() throws RecognitionException {
        try {
            int _type = Quantity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:53:10: ( ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:53:12: ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Quantity"

    // $ANTLR start "Register"
    public final void mRegister() throws RecognitionException {
        try {
            int _type = Register;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:55:10: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:55:12: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Register"

    // $ANTLR start "Severity"
    public final void mSeverity() throws RecognitionException {
        try {
            int _type = Severity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:57:10: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:57:12: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Severity"

    // $ANTLR start "Spectrum"
    public final void mSpectrum() throws RecognitionException {
        try {
            int _type = Spectrum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:59:10: ( ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:59:12: ( 'S' | 's' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Spectrum"

    // $ANTLR start "Terminal"
    public final void mTerminal() throws RecognitionException {
        try {
            int _type = Terminal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:61:10: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:61:12: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Terminal"

    // $ANTLR start "Variable"
    public final void mVariable() throws RecognitionException {
        try {
            int _type = Variable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:63:10: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:63:12: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variable"

    // $ANTLR start "Generic"
    public final void mGeneric() throws RecognitionException {
        try {
            int _type = Generic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:65:9: ( ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:65:11: ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Generic"

    // $ANTLR start "Guarded"
    public final void mGuarded() throws RecognitionException {
        try {
            int _type = Guarded;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:67:9: ( ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:67:11: ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Guarded"

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:69:9: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:69:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Library"

    // $ANTLR start "Linkage"
    public final void mLinkage() throws RecognitionException {
        try {
            int _type = Linkage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:71:9: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:71:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Linkage"

    // $ANTLR start "Literal"
    public final void mLiteral() throws RecognitionException {
        try {
            int _type = Literal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:73:9: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:73:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Literal"

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:75:9: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:75:11: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Process"
    public final void mProcess() throws RecognitionException {
        try {
            int _type = Process;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:77:9: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:77:11: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Process"

    // $ANTLR start "Subtype"
    public final void mSubtype() throws RecognitionException {
        try {
            int _type = Subtype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:79:9: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:79:11: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subtype"

    // $ANTLR start "Through"
    public final void mThrough() throws RecognitionException {
        try {
            int _type = Through;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:81:9: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:81:11: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Through"

    // $ANTLR start "Access"
    public final void mAccess() throws RecognitionException {
        try {
            int _type = Access;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:83:8: ( ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:83:10: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Access"

    // $ANTLR start "Across"
    public final void mAcross() throws RecognitionException {
        try {
            int _type = Across;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:85:8: ( ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:85:10: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Across"

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:87:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:87:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Buffer"
    public final void mBuffer() throws RecognitionException {
        try {
            int _type = Buffer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:89:8: ( ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:89:10: ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Buffer"

    // $ANTLR start "Downto"
    public final void mDownto() throws RecognitionException {
        try {
            int _type = Downto;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:91:8: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:91:10: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Downto"

    // $ANTLR start "Entity"
    public final void mEntity() throws RecognitionException {
        try {
            int _type = Entity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:93:8: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:93:10: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entity"

    // $ANTLR start "Impure"
    public final void mImpure() throws RecognitionException {
        try {
            int _type = Impure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:95:8: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:95:10: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Impure"

    // $ANTLR start "Nature"
    public final void mNature() throws RecognitionException {
        try {
            int _type = Nature;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:97:8: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:97:10: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nature"

    // $ANTLR start "Others"
    public final void mOthers() throws RecognitionException {
        try {
            int _type = Others;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:99:8: ( ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:99:10: ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Others"

    // $ANTLR start "Record"
    public final void mRecord() throws RecognitionException {
        try {
            int _type = Record;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:101:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:101:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Record"

    // $ANTLR start "Reject"
    public final void mReject() throws RecognitionException {
        try {
            int _type = Reject;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:103:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:103:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reject"

    // $ANTLR start "Report"
    public final void mReport() throws RecognitionException {
        try {
            int _type = Report;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:105:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:105:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Report"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:107:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:107:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Select"
    public final void mSelect() throws RecognitionException {
        try {
            int _type = Select;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:109:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:109:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Select"

    // $ANTLR start "Shared"
    public final void mShared() throws RecognitionException {
        try {
            int _type = Shared;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:111:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:111:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shared"

    // $ANTLR start "Signal"
    public final void mSignal() throws RecognitionException {
        try {
            int _type = Signal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:113:8: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:113:10: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Signal"

    // $ANTLR start "After"
    public final void mAfter() throws RecognitionException {
        try {
            int _type = After;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:115:7: ( ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:115:9: ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "After"

    // $ANTLR start "Alias"
    public final void mAlias() throws RecognitionException {
        try {
            int _type = Alias;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:117:7: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:117:9: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Alias"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:119:7: ( ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:119:9: ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Begin"
    public final void mBegin() throws RecognitionException {
        try {
            int _type = Begin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:121:7: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:121:9: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Begin"

    // $ANTLR start "Block"
    public final void mBlock() throws RecognitionException {
        try {
            int _type = Block;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:123:7: ( ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'K' | 'k' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:123:9: ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Block"

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:125:7: ( ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:125:9: ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Break"

    // $ANTLR start "Elsif"
    public final void mElsif() throws RecognitionException {
        try {
            int _type = Elsif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:127:7: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:127:9: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elsif"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:129:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:129:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Group"

    // $ANTLR start "Inout"
    public final void mInout() throws RecognitionException {
        try {
            int _type = Inout;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:131:7: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:131:9: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inout"

    // $ANTLR start "Label"
    public final void mLabel() throws RecognitionException {
        try {
            int _type = Label;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:133:7: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:133:9: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Label"

    // $ANTLR start "Limit"
    public final void mLimit() throws RecognitionException {
        try {
            int _type = Limit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:135:7: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:135:9: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Limit"

    // $ANTLR start "Noise"
    public final void mNoise() throws RecognitionException {
        try {
            int _type = Noise;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:137:7: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:137:9: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Noise"

    // $ANTLR start "Range"
    public final void mRange() throws RecognitionException {
        try {
            int _type = Range;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:139:7: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:139:9: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Range"

    // $ANTLR start "Units"
    public final void mUnits() throws RecognitionException {
        try {
            int _type = Units;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:141:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:141:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Units"

    // $ANTLR start "Until"
    public final void mUntil() throws RecognitionException {
        try {
            int _type = Until;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:143:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:143:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Until"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:145:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:145:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Body"
    public final void mBody() throws RecognitionException {
        try {
            int _type = Body;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:147:6: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'Y' | 'y' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:147:8: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Body"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:149:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:149:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:151:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:151:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Exit"
    public final void mExit() throws RecognitionException {
        try {
            int _type = Exit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:153:6: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:153:8: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exit"

    // $ANTLR start "File"
    public final void mFile() throws RecognitionException {
        try {
            int _type = File;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:155:6: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:155:8: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "File"

    // $ANTLR start "Loop"
    public final void mLoop() throws RecognitionException {
        try {
            int _type = Loop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:157:6: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:157:8: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Loop"

    // $ANTLR start "Nand"
    public final void mNand() throws RecognitionException {
        try {
            int _type = Nand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:159:6: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:159:8: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nand"

    // $ANTLR start "Next"
    public final void mNext() throws RecognitionException {
        try {
            int _type = Next;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:161:6: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:161:8: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Next"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:163:6: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:163:8: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Open"
    public final void mOpen() throws RecognitionException {
        try {
            int _type = Open;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:165:6: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:165:8: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Open"

    // $ANTLR start "Port"
    public final void mPort() throws RecognitionException {
        try {
            int _type = Port;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:167:6: ( ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:167:8: ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Port"

    // $ANTLR start "Pure"
    public final void mPure() throws RecognitionException {
        try {
            int _type = Pure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:169:6: ( ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:169:8: ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pure"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:171:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:171:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:173:6: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:173:8: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Wait"
    public final void mWait() throws RecognitionException {
        try {
            int _type = Wait;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:175:6: ( ( 'W' | 'w' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:175:8: ( 'W' | 'w' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Wait"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:177:6: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:177:8: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:179:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:179:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "Xnor"
    public final void mXnor() throws RecognitionException {
        try {
            int _type = Xnor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:181:6: ( ( 'X' | 'x' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:181:8: ( 'X' | 'x' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xnor"

    // $ANTLR start "Abs"
    public final void mAbs() throws RecognitionException {
        try {
            int _type = Abs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:183:5: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:183:7: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abs"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:185:5: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:185:7: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:187:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:187:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Bus"
    public final void mBus() throws RecognitionException {
        try {
            int _type = Bus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:189:5: ( ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:189:7: ( 'B' | 'b' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bus"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:191:5: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:191:7: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:193:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:193:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Map"
    public final void mMap() throws RecognitionException {
        try {
            int _type = Map;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:195:5: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:195:7: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Map"

    // $ANTLR start "Mod"
    public final void mMod() throws RecognitionException {
        try {
            int _type = Mod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:197:5: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:197:7: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mod"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:199:5: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:199:7: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Nor"
    public final void mNor() throws RecognitionException {
        try {
            int _type = Nor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:201:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:201:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nor"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:203:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:203:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Out"
    public final void mOut() throws RecognitionException {
        try {
            int _type = Out;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:205:5: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:205:7: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Out"

    // $ANTLR start "Rem"
    public final void mRem() throws RecognitionException {
        try {
            int _type = Rem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:207:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:207:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rem"

    // $ANTLR start "Rol"
    public final void mRol() throws RecognitionException {
        try {
            int _type = Rol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:209:5: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:209:7: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rol"

    // $ANTLR start "Ror"
    public final void mRor() throws RecognitionException {
        try {
            int _type = Ror;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:211:5: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:211:7: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ror"

    // $ANTLR start "Sla"
    public final void mSla() throws RecognitionException {
        try {
            int _type = Sla;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:213:5: ( ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:213:7: ( 'S' | 's' ) ( 'L' | 'l' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sla"

    // $ANTLR start "Sll"
    public final void mSll() throws RecognitionException {
        try {
            int _type = Sll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:215:5: ( ( 'S' | 's' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:215:7: ( 'S' | 's' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sll"

    // $ANTLR start "Sra"
    public final void mSra() throws RecognitionException {
        try {
            int _type = Sra;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:217:5: ( ( 'S' | 's' ) ( 'R' | 'r' ) ( 'A' | 'a' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:217:7: ( 'S' | 's' ) ( 'R' | 'r' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sra"

    // $ANTLR start "Srl"
    public final void mSrl() throws RecognitionException {
        try {
            int _type = Srl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:219:5: ( ( 'S' | 's' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:219:7: ( 'S' | 's' ) ( 'R' | 'r' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Srl"

    // $ANTLR start "Use"
    public final void mUse() throws RecognitionException {
        try {
            int _type = Use;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:221:5: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:221:7: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Use"

    // $ANTLR start "Xor"
    public final void mXor() throws RecognitionException {
        try {
            int _type = Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:223:5: ( ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:223:7: ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xor"

    // $ANTLR start "AsteriskAsterisk"
    public final void mAsteriskAsterisk() throws RecognitionException {
        try {
            int _type = AsteriskAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:225:18: ( '*' '*' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:225:20: '*' '*'
            {
            match('*'); 
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskAsterisk"

    // $ANTLR start "SolidusEqualsSign"
    public final void mSolidusEqualsSign() throws RecognitionException {
        try {
            int _type = SolidusEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:227:19: ( '/' '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:227:21: '/' '='
            {
            match('/'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SolidusEqualsSign"

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:229:17: ( ':' '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:229:19: ':' '='
            {
            match(':'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:231:24: ( '<' '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:231:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:233:29: ( '<' '>' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:233:31: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:235:22: ( '=' '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:235:24: '=' '='
            {
            match('='); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:237:27: ( '=' '>' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:237:29: '=' '>'
            {
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:239:27: ( '>' '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:239:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:241:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:241:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:243:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:243:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Is"
    public final void mIs() throws RecognitionException {
        try {
            int _type = Is;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:245:4: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:245:6: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Is"

    // $ANTLR start "Of"
    public final void mOf() throws RecognitionException {
        try {
            int _type = Of;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:247:4: ( ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:247:6: ( 'O' | 'o' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Of"

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:249:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:249:6: ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:251:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:251:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:253:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:253:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:255:11: ( '&' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:255:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:257:17: ( '(' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:257:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:259:18: ( ')' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:259:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:261:10: ( '*' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:261:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:263:10: ( '+' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:263:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:265:7: ( ',' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:265:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:267:13: ( '-' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:267:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:269:10: ( '.' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:269:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:271:9: ( '/' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:271:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:273:7: ( ':' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:273:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:275:11: ( ';' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:275:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:277:14: ( '<' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:277:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:279:12: ( '=' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:279:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:281:17: ( '>' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:281:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:283:19: ( '[' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:283:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:285:20: ( ']' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:285:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:287:14: ( '|' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:287:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RULE_ABSTRACT_LITERAL"
    public final void mRULE_ABSTRACT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_ABSTRACT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:23: ( RULE_INTEGER_FRAGMENT ( ( '.' RULE_INTEGER_FRAGMENT )? | '#' RULE_BASED_INTEGER_FRAGMENT ( '.' RULE_BASED_INTEGER_FRAGMENT )? '#' ) ( RULE_EXPONENT_FRAGMENT )? )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:25: RULE_INTEGER_FRAGMENT ( ( '.' RULE_INTEGER_FRAGMENT )? | '#' RULE_BASED_INTEGER_FRAGMENT ( '.' RULE_BASED_INTEGER_FRAGMENT )? '#' ) ( RULE_EXPONENT_FRAGMENT )?
            {
            mRULE_INTEGER_FRAGMENT(); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:47: ( ( '.' RULE_INTEGER_FRAGMENT )? | '#' RULE_BASED_INTEGER_FRAGMENT ( '.' RULE_BASED_INTEGER_FRAGMENT )? '#' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='#') ) {
                alt3=2;
            }
            else {
                alt3=1;}
            switch (alt3) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:48: ( '.' RULE_INTEGER_FRAGMENT )?
                    {
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:48: ( '.' RULE_INTEGER_FRAGMENT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='.') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:49: '.' RULE_INTEGER_FRAGMENT
                            {
                            match('.'); 
                            mRULE_INTEGER_FRAGMENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:77: '#' RULE_BASED_INTEGER_FRAGMENT ( '.' RULE_BASED_INTEGER_FRAGMENT )? '#'
                    {
                    match('#'); 
                    mRULE_BASED_INTEGER_FRAGMENT(); 
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:109: ( '.' RULE_BASED_INTEGER_FRAGMENT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='.') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:110: '.' RULE_BASED_INTEGER_FRAGMENT
                            {
                            match('.'); 
                            mRULE_BASED_INTEGER_FRAGMENT(); 

                            }
                            break;

                    }

                    match('#'); 

                    }
                    break;

            }

            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:149: ( RULE_EXPONENT_FRAGMENT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:291:149: RULE_EXPONENT_FRAGMENT
                    {
                    mRULE_EXPONENT_FRAGMENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABSTRACT_LITERAL"

    // $ANTLR start "RULE_BIT_STRING_LITERAL"
    public final void mRULE_BIT_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BIT_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:293:25: ( ( RULE_INTEGER_FRAGMENT )? RULE_BASE_SPECIFIER_FRAGMENT RULE_STRING )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:293:27: ( RULE_INTEGER_FRAGMENT )? RULE_BASE_SPECIFIER_FRAGMENT RULE_STRING
            {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:293:27: ( RULE_INTEGER_FRAGMENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:293:27: RULE_INTEGER_FRAGMENT
                    {
                    mRULE_INTEGER_FRAGMENT(); 

                    }
                    break;

            }

            mRULE_BASE_SPECIFIER_FRAGMENT(); 
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT_STRING_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:295:9: ( ( '^' )? RULE_LETTER_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )* )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:295:11: ( '^' )? RULE_LETTER_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:295:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:295:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mRULE_LETTER_FRAGMENT(); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:295:37: ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_EXTENDED_IDENTIFIER"
    public final void mRULE_EXTENDED_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_EXTENDED_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:297:26: ( '\\\\' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\r' | '\\n' ) ) )+ '\\\\' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:297:28: '\\\\' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\r' | '\\n' ) ) )+ '\\\\'
            {
            match('\\'); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:297:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\r' | '\\n' ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\"'||LA8_1=='\''||LA8_1=='\\'||LA8_1=='b'||LA8_1=='f'||LA8_1=='n'||LA8_1=='r'||LA8_1=='t') ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:297:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:297:75: ~ ( ( '\\\\' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_IDENTIFIER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:299:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:299:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
            {
            match('\"'); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:299:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:299:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:299:61: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:11: ( ( '\\'a\\'' | '\\'b\\'' | '\\'c\\'' | '\\'d\\'' | '\\'e\\'' | '\\'f\\'' | '\\'g\\'' | '\\'h\\'' | '\\'i\\'' | '\\'j\\'' | '\\'k\\'' | '\\'l\\'' | '\\'m\\'' | '\\'n\\'' | '\\'o\\'' | '\\'p\\'' | '\\'q\\'' | '\\'r\\'' | '\\'s\\'' | '\\'t\\'' | '\\'u\\'' | '\\'v\\'' | '\\'w\\'' | '\\'x\\'' | '\\'y\\'' | '\\'z\\'' | '\\'A\\'' | '\\'B\\'' | '\\'C\\'' | '\\'D\\'' | '\\'E\\'' | '\\'F\\'' | '\\'G\\'' | '\\'H\\'' | '\\'I\\'' | '\\'J\\'' | '\\'K\\'' | '\\'L\\'' | '\\'M\\'' | '\\'N\\'' | '\\'O\\'' | '\\'P\\'' | '\\'Q\\'' | '\\'R\\'' | '\\'S\\'' | '\\'T\\'' | '\\'U\\'' | '\\'V\\'' | '\\'W\\'' | '\\'X\\'' | '\\'Y\\'' | '\\'Z\\'' | '\\'0\\'' | '\\'1\\'' | '\\'2\\'' | '\\'3\\'' | '\\'4\\'' | '\\'5\\'' | '\\'6\\'' | '\\'7\\'' | '\\'8\\'' | '\\'9\\'' | '\\'&\\'' | '\\'\\'\\'' | '\\'(\\'' | '\\')\\'' | '\\'+\\'' | '\\',\\'' | '\\'-\\'' | '\\'.\\'' | '\\'/\\'' | '\\':\\'' | '\\';\\'' | '\\'<\\'' | '\\'=\\'' | '\\'>\\'' | '\\'|\\'' | '\\' \\'' | '\\'#\\'' | '\\'[\\'' | '\\']\\'' | '\\'_\\'' | '\\'*\\'' | '\\'\"\\'' | '\\'!\\'' | '\\'$\\'' | '\\'%\\'' | '\\'@\\'' | '\\'?\\'' | '\\'^\\'' | '\\'`\\'' | '\\'{\\'' | '\\'}\\'' | '\\'~\\'' | '\\'\\u00A0\\'' | '\\'\\u00A1\\'' | '\\'\\u00A2\\'' | '\\'\\u00A3\\'' | '\\'\\u20AC\\'' | '\\'\\u00A5\\'' | '\\'\\u0160\\'' | '\\'\\u00A7\\'' | '\\'\\u0161\\'' | '\\'\\u00A9\\'' | '\\'\\u00AA\\'' | '\\'\\u00AB\\'' | '\\'\\u00AC\\'' | '\\'\\'' | '\\'\\u00AE\\'' | '\\'\\u00AF\\'' | '\\'\\u00B0\\'' | '\\'\\u00B1\\'' | '\\'\\u00B2\\'' | '\\'\\u00B3\\'' | '\\'\\u017D\\'' | '\\'\\u00B5\\'' | '\\'\\u00B6\\'' | '\\'\\u00B7\\'' | '\\'\\u017E\\'' | '\\'\\u00B9\\'' | '\\'\\u00BA\\'' | '\\'\\u00BB\\'' | '\\'\\u0152\\'' | '\\'\\u0153\\'' | '\\'\\u0178\\'' | '\\'\\u00BF\\'' | '\\'\\u00C0\\'' | '\\'\\u00C1\\'' | '\\'\\u00C2\\'' | '\\'\\u00C3\\'' | '\\'\\u00C4\\'' | '\\'\\u00C5\\'' | '\\'\\u00C6\\'' | '\\'\\u00C7\\'' | '\\'\\u00C8\\'' | '\\'\\u00C9\\'' | '\\'\\u00CA\\'' | '\\'\\u00CB\\'' | '\\'\\u00CC\\'' | '\\'\\u00CD\\'' | '\\'\\u00CE\\'' | '\\'\\u00CF\\'' | '\\'\\u00D0\\'' | '\\'\\u00D1\\'' | '\\'\\u00D2\\'' | '\\'\\u00D3\\'' | '\\'\\u00D4\\'' | '\\'\\u00D5\\'' | '\\'\\u00D6\\'' | '\\'\\u00D7\\'' | '\\'\\u00D8\\'' | '\\'\\u00D9\\'' | '\\'\\u00DA\\'' | '\\'\\u00DB\\'' | '\\'\\u00DC\\'' | '\\'\\u00DD\\'' | '\\'\\u00DE\\'' | '\\'\\u00DF\\'' | '\\'\\u00E0\\'' | '\\'\\u00E1\\'' | '\\'\\u00E2\\'' | '\\'\\u00E3\\'' | '\\'\\u00E4\\'' | '\\'\\u00E5\\'' | '\\'\\u00E6\\'' | '\\'\\u00E7\\'' | '\\'\\u00E8\\'' | '\\'\\u00E9\\'' | '\\'\\u00EA\\'' | '\\'\\u00EB\\'' | '\\'\\u00EC\\'' | '\\'\\u00ED\\'' | '\\'\\u00EE\\'' | '\\'\\u00EF\\'' | '\\'\\u00F0\\'' | '\\'\\u00F1\\'' | '\\'\\u00F2\\'' | '\\'\\u00F3\\'' | '\\'\\u00F4\\'' | '\\'\\u00F5\\'' | '\\'\\u00F6\\'' | '\\'\\u00F7\\'' | '\\'\\u00F8\\'' | '\\'\\u00F9\\'' | '\\'\\u00FA\\'' | '\\'\\u00FB\\'' | '\\'\\u00FC\\'' | '\\'\\u00FD\\'' | '\\'\\u00FE\\'' | '\\'\\u00FF\\'' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:13: ( '\\'a\\'' | '\\'b\\'' | '\\'c\\'' | '\\'d\\'' | '\\'e\\'' | '\\'f\\'' | '\\'g\\'' | '\\'h\\'' | '\\'i\\'' | '\\'j\\'' | '\\'k\\'' | '\\'l\\'' | '\\'m\\'' | '\\'n\\'' | '\\'o\\'' | '\\'p\\'' | '\\'q\\'' | '\\'r\\'' | '\\'s\\'' | '\\'t\\'' | '\\'u\\'' | '\\'v\\'' | '\\'w\\'' | '\\'x\\'' | '\\'y\\'' | '\\'z\\'' | '\\'A\\'' | '\\'B\\'' | '\\'C\\'' | '\\'D\\'' | '\\'E\\'' | '\\'F\\'' | '\\'G\\'' | '\\'H\\'' | '\\'I\\'' | '\\'J\\'' | '\\'K\\'' | '\\'L\\'' | '\\'M\\'' | '\\'N\\'' | '\\'O\\'' | '\\'P\\'' | '\\'Q\\'' | '\\'R\\'' | '\\'S\\'' | '\\'T\\'' | '\\'U\\'' | '\\'V\\'' | '\\'W\\'' | '\\'X\\'' | '\\'Y\\'' | '\\'Z\\'' | '\\'0\\'' | '\\'1\\'' | '\\'2\\'' | '\\'3\\'' | '\\'4\\'' | '\\'5\\'' | '\\'6\\'' | '\\'7\\'' | '\\'8\\'' | '\\'9\\'' | '\\'&\\'' | '\\'\\'\\'' | '\\'(\\'' | '\\')\\'' | '\\'+\\'' | '\\',\\'' | '\\'-\\'' | '\\'.\\'' | '\\'/\\'' | '\\':\\'' | '\\';\\'' | '\\'<\\'' | '\\'=\\'' | '\\'>\\'' | '\\'|\\'' | '\\' \\'' | '\\'#\\'' | '\\'[\\'' | '\\']\\'' | '\\'_\\'' | '\\'*\\'' | '\\'\"\\'' | '\\'!\\'' | '\\'$\\'' | '\\'%\\'' | '\\'@\\'' | '\\'?\\'' | '\\'^\\'' | '\\'`\\'' | '\\'{\\'' | '\\'}\\'' | '\\'~\\'' | '\\'\\u00A0\\'' | '\\'\\u00A1\\'' | '\\'\\u00A2\\'' | '\\'\\u00A3\\'' | '\\'\\u20AC\\'' | '\\'\\u00A5\\'' | '\\'\\u0160\\'' | '\\'\\u00A7\\'' | '\\'\\u0161\\'' | '\\'\\u00A9\\'' | '\\'\\u00AA\\'' | '\\'\\u00AB\\'' | '\\'\\u00AC\\'' | '\\'\\'' | '\\'\\u00AE\\'' | '\\'\\u00AF\\'' | '\\'\\u00B0\\'' | '\\'\\u00B1\\'' | '\\'\\u00B2\\'' | '\\'\\u00B3\\'' | '\\'\\u017D\\'' | '\\'\\u00B5\\'' | '\\'\\u00B6\\'' | '\\'\\u00B7\\'' | '\\'\\u017E\\'' | '\\'\\u00B9\\'' | '\\'\\u00BA\\'' | '\\'\\u00BB\\'' | '\\'\\u0152\\'' | '\\'\\u0153\\'' | '\\'\\u0178\\'' | '\\'\\u00BF\\'' | '\\'\\u00C0\\'' | '\\'\\u00C1\\'' | '\\'\\u00C2\\'' | '\\'\\u00C3\\'' | '\\'\\u00C4\\'' | '\\'\\u00C5\\'' | '\\'\\u00C6\\'' | '\\'\\u00C7\\'' | '\\'\\u00C8\\'' | '\\'\\u00C9\\'' | '\\'\\u00CA\\'' | '\\'\\u00CB\\'' | '\\'\\u00CC\\'' | '\\'\\u00CD\\'' | '\\'\\u00CE\\'' | '\\'\\u00CF\\'' | '\\'\\u00D0\\'' | '\\'\\u00D1\\'' | '\\'\\u00D2\\'' | '\\'\\u00D3\\'' | '\\'\\u00D4\\'' | '\\'\\u00D5\\'' | '\\'\\u00D6\\'' | '\\'\\u00D7\\'' | '\\'\\u00D8\\'' | '\\'\\u00D9\\'' | '\\'\\u00DA\\'' | '\\'\\u00DB\\'' | '\\'\\u00DC\\'' | '\\'\\u00DD\\'' | '\\'\\u00DE\\'' | '\\'\\u00DF\\'' | '\\'\\u00E0\\'' | '\\'\\u00E1\\'' | '\\'\\u00E2\\'' | '\\'\\u00E3\\'' | '\\'\\u00E4\\'' | '\\'\\u00E5\\'' | '\\'\\u00E6\\'' | '\\'\\u00E7\\'' | '\\'\\u00E8\\'' | '\\'\\u00E9\\'' | '\\'\\u00EA\\'' | '\\'\\u00EB\\'' | '\\'\\u00EC\\'' | '\\'\\u00ED\\'' | '\\'\\u00EE\\'' | '\\'\\u00EF\\'' | '\\'\\u00F0\\'' | '\\'\\u00F1\\'' | '\\'\\u00F2\\'' | '\\'\\u00F3\\'' | '\\'\\u00F4\\'' | '\\'\\u00F5\\'' | '\\'\\u00F6\\'' | '\\'\\u00F7\\'' | '\\'\\u00F8\\'' | '\\'\\u00F9\\'' | '\\'\\u00FA\\'' | '\\'\\u00FB\\'' | '\\'\\u00FC\\'' | '\\'\\u00FD\\'' | '\\'\\u00FE\\'' | '\\'\\u00FF\\'' )
            {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:13: ( '\\'a\\'' | '\\'b\\'' | '\\'c\\'' | '\\'d\\'' | '\\'e\\'' | '\\'f\\'' | '\\'g\\'' | '\\'h\\'' | '\\'i\\'' | '\\'j\\'' | '\\'k\\'' | '\\'l\\'' | '\\'m\\'' | '\\'n\\'' | '\\'o\\'' | '\\'p\\'' | '\\'q\\'' | '\\'r\\'' | '\\'s\\'' | '\\'t\\'' | '\\'u\\'' | '\\'v\\'' | '\\'w\\'' | '\\'x\\'' | '\\'y\\'' | '\\'z\\'' | '\\'A\\'' | '\\'B\\'' | '\\'C\\'' | '\\'D\\'' | '\\'E\\'' | '\\'F\\'' | '\\'G\\'' | '\\'H\\'' | '\\'I\\'' | '\\'J\\'' | '\\'K\\'' | '\\'L\\'' | '\\'M\\'' | '\\'N\\'' | '\\'O\\'' | '\\'P\\'' | '\\'Q\\'' | '\\'R\\'' | '\\'S\\'' | '\\'T\\'' | '\\'U\\'' | '\\'V\\'' | '\\'W\\'' | '\\'X\\'' | '\\'Y\\'' | '\\'Z\\'' | '\\'0\\'' | '\\'1\\'' | '\\'2\\'' | '\\'3\\'' | '\\'4\\'' | '\\'5\\'' | '\\'6\\'' | '\\'7\\'' | '\\'8\\'' | '\\'9\\'' | '\\'&\\'' | '\\'\\'\\'' | '\\'(\\'' | '\\')\\'' | '\\'+\\'' | '\\',\\'' | '\\'-\\'' | '\\'.\\'' | '\\'/\\'' | '\\':\\'' | '\\';\\'' | '\\'<\\'' | '\\'=\\'' | '\\'>\\'' | '\\'|\\'' | '\\' \\'' | '\\'#\\'' | '\\'[\\'' | '\\']\\'' | '\\'_\\'' | '\\'*\\'' | '\\'\"\\'' | '\\'!\\'' | '\\'$\\'' | '\\'%\\'' | '\\'@\\'' | '\\'?\\'' | '\\'^\\'' | '\\'`\\'' | '\\'{\\'' | '\\'}\\'' | '\\'~\\'' | '\\'\\u00A0\\'' | '\\'\\u00A1\\'' | '\\'\\u00A2\\'' | '\\'\\u00A3\\'' | '\\'\\u20AC\\'' | '\\'\\u00A5\\'' | '\\'\\u0160\\'' | '\\'\\u00A7\\'' | '\\'\\u0161\\'' | '\\'\\u00A9\\'' | '\\'\\u00AA\\'' | '\\'\\u00AB\\'' | '\\'\\u00AC\\'' | '\\'\\'' | '\\'\\u00AE\\'' | '\\'\\u00AF\\'' | '\\'\\u00B0\\'' | '\\'\\u00B1\\'' | '\\'\\u00B2\\'' | '\\'\\u00B3\\'' | '\\'\\u017D\\'' | '\\'\\u00B5\\'' | '\\'\\u00B6\\'' | '\\'\\u00B7\\'' | '\\'\\u017E\\'' | '\\'\\u00B9\\'' | '\\'\\u00BA\\'' | '\\'\\u00BB\\'' | '\\'\\u0152\\'' | '\\'\\u0153\\'' | '\\'\\u0178\\'' | '\\'\\u00BF\\'' | '\\'\\u00C0\\'' | '\\'\\u00C1\\'' | '\\'\\u00C2\\'' | '\\'\\u00C3\\'' | '\\'\\u00C4\\'' | '\\'\\u00C5\\'' | '\\'\\u00C6\\'' | '\\'\\u00C7\\'' | '\\'\\u00C8\\'' | '\\'\\u00C9\\'' | '\\'\\u00CA\\'' | '\\'\\u00CB\\'' | '\\'\\u00CC\\'' | '\\'\\u00CD\\'' | '\\'\\u00CE\\'' | '\\'\\u00CF\\'' | '\\'\\u00D0\\'' | '\\'\\u00D1\\'' | '\\'\\u00D2\\'' | '\\'\\u00D3\\'' | '\\'\\u00D4\\'' | '\\'\\u00D5\\'' | '\\'\\u00D6\\'' | '\\'\\u00D7\\'' | '\\'\\u00D8\\'' | '\\'\\u00D9\\'' | '\\'\\u00DA\\'' | '\\'\\u00DB\\'' | '\\'\\u00DC\\'' | '\\'\\u00DD\\'' | '\\'\\u00DE\\'' | '\\'\\u00DF\\'' | '\\'\\u00E0\\'' | '\\'\\u00E1\\'' | '\\'\\u00E2\\'' | '\\'\\u00E3\\'' | '\\'\\u00E4\\'' | '\\'\\u00E5\\'' | '\\'\\u00E6\\'' | '\\'\\u00E7\\'' | '\\'\\u00E8\\'' | '\\'\\u00E9\\'' | '\\'\\u00EA\\'' | '\\'\\u00EB\\'' | '\\'\\u00EC\\'' | '\\'\\u00ED\\'' | '\\'\\u00EE\\'' | '\\'\\u00EF\\'' | '\\'\\u00F0\\'' | '\\'\\u00F1\\'' | '\\'\\u00F2\\'' | '\\'\\u00F3\\'' | '\\'\\u00F4\\'' | '\\'\\u00F5\\'' | '\\'\\u00F6\\'' | '\\'\\u00F7\\'' | '\\'\\u00F8\\'' | '\\'\\u00F9\\'' | '\\'\\u00FA\\'' | '\\'\\u00FB\\'' | '\\'\\u00FC\\'' | '\\'\\u00FD\\'' | '\\'\\u00FE\\'' | '\\'\\u00FF\\'' )
            int alt10=190;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:14: '\\'a\\''
                    {
                    match("'a'"); 


                    }
                    break;
                case 2 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:22: '\\'b\\''
                    {
                    match("'b'"); 


                    }
                    break;
                case 3 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:30: '\\'c\\''
                    {
                    match("'c'"); 


                    }
                    break;
                case 4 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:38: '\\'d\\''
                    {
                    match("'d'"); 


                    }
                    break;
                case 5 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:46: '\\'e\\''
                    {
                    match("'e'"); 


                    }
                    break;
                case 6 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:54: '\\'f\\''
                    {
                    match("'f'"); 


                    }
                    break;
                case 7 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:62: '\\'g\\''
                    {
                    match("'g'"); 


                    }
                    break;
                case 8 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:70: '\\'h\\''
                    {
                    match("'h'"); 


                    }
                    break;
                case 9 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:78: '\\'i\\''
                    {
                    match("'i'"); 


                    }
                    break;
                case 10 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:86: '\\'j\\''
                    {
                    match("'j'"); 


                    }
                    break;
                case 11 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:94: '\\'k\\''
                    {
                    match("'k'"); 


                    }
                    break;
                case 12 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:102: '\\'l\\''
                    {
                    match("'l'"); 


                    }
                    break;
                case 13 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:110: '\\'m\\''
                    {
                    match("'m'"); 


                    }
                    break;
                case 14 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:118: '\\'n\\''
                    {
                    match("'n'"); 


                    }
                    break;
                case 15 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:126: '\\'o\\''
                    {
                    match("'o'"); 


                    }
                    break;
                case 16 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:134: '\\'p\\''
                    {
                    match("'p'"); 


                    }
                    break;
                case 17 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:142: '\\'q\\''
                    {
                    match("'q'"); 


                    }
                    break;
                case 18 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:150: '\\'r\\''
                    {
                    match("'r'"); 


                    }
                    break;
                case 19 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:158: '\\'s\\''
                    {
                    match("'s'"); 


                    }
                    break;
                case 20 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:166: '\\'t\\''
                    {
                    match("'t'"); 


                    }
                    break;
                case 21 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:174: '\\'u\\''
                    {
                    match("'u'"); 


                    }
                    break;
                case 22 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:182: '\\'v\\''
                    {
                    match("'v'"); 


                    }
                    break;
                case 23 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:190: '\\'w\\''
                    {
                    match("'w'"); 


                    }
                    break;
                case 24 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:198: '\\'x\\''
                    {
                    match("'x'"); 


                    }
                    break;
                case 25 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:206: '\\'y\\''
                    {
                    match("'y'"); 


                    }
                    break;
                case 26 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:214: '\\'z\\''
                    {
                    match("'z'"); 


                    }
                    break;
                case 27 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:222: '\\'A\\''
                    {
                    match("'A'"); 


                    }
                    break;
                case 28 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:230: '\\'B\\''
                    {
                    match("'B'"); 


                    }
                    break;
                case 29 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:238: '\\'C\\''
                    {
                    match("'C'"); 


                    }
                    break;
                case 30 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:246: '\\'D\\''
                    {
                    match("'D'"); 


                    }
                    break;
                case 31 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:254: '\\'E\\''
                    {
                    match("'E'"); 


                    }
                    break;
                case 32 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:262: '\\'F\\''
                    {
                    match("'F'"); 


                    }
                    break;
                case 33 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:270: '\\'G\\''
                    {
                    match("'G'"); 


                    }
                    break;
                case 34 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:278: '\\'H\\''
                    {
                    match("'H'"); 


                    }
                    break;
                case 35 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:286: '\\'I\\''
                    {
                    match("'I'"); 


                    }
                    break;
                case 36 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:294: '\\'J\\''
                    {
                    match("'J'"); 


                    }
                    break;
                case 37 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:302: '\\'K\\''
                    {
                    match("'K'"); 


                    }
                    break;
                case 38 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:310: '\\'L\\''
                    {
                    match("'L'"); 


                    }
                    break;
                case 39 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:318: '\\'M\\''
                    {
                    match("'M'"); 


                    }
                    break;
                case 40 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:326: '\\'N\\''
                    {
                    match("'N'"); 


                    }
                    break;
                case 41 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:334: '\\'O\\''
                    {
                    match("'O'"); 


                    }
                    break;
                case 42 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:342: '\\'P\\''
                    {
                    match("'P'"); 


                    }
                    break;
                case 43 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:350: '\\'Q\\''
                    {
                    match("'Q'"); 


                    }
                    break;
                case 44 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:358: '\\'R\\''
                    {
                    match("'R'"); 


                    }
                    break;
                case 45 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:366: '\\'S\\''
                    {
                    match("'S'"); 


                    }
                    break;
                case 46 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:374: '\\'T\\''
                    {
                    match("'T'"); 


                    }
                    break;
                case 47 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:382: '\\'U\\''
                    {
                    match("'U'"); 


                    }
                    break;
                case 48 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:390: '\\'V\\''
                    {
                    match("'V'"); 


                    }
                    break;
                case 49 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:398: '\\'W\\''
                    {
                    match("'W'"); 


                    }
                    break;
                case 50 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:406: '\\'X\\''
                    {
                    match("'X'"); 


                    }
                    break;
                case 51 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:414: '\\'Y\\''
                    {
                    match("'Y'"); 


                    }
                    break;
                case 52 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:422: '\\'Z\\''
                    {
                    match("'Z'"); 


                    }
                    break;
                case 53 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:430: '\\'0\\''
                    {
                    match("'0'"); 


                    }
                    break;
                case 54 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:438: '\\'1\\''
                    {
                    match("'1'"); 


                    }
                    break;
                case 55 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:446: '\\'2\\''
                    {
                    match("'2'"); 


                    }
                    break;
                case 56 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:454: '\\'3\\''
                    {
                    match("'3'"); 


                    }
                    break;
                case 57 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:462: '\\'4\\''
                    {
                    match("'4'"); 


                    }
                    break;
                case 58 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:470: '\\'5\\''
                    {
                    match("'5'"); 


                    }
                    break;
                case 59 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:478: '\\'6\\''
                    {
                    match("'6'"); 


                    }
                    break;
                case 60 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:486: '\\'7\\''
                    {
                    match("'7'"); 


                    }
                    break;
                case 61 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:494: '\\'8\\''
                    {
                    match("'8'"); 


                    }
                    break;
                case 62 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:502: '\\'9\\''
                    {
                    match("'9'"); 


                    }
                    break;
                case 63 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:510: '\\'&\\''
                    {
                    match("'&'"); 


                    }
                    break;
                case 64 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:518: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 65 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:527: '\\'(\\''
                    {
                    match("'('"); 


                    }
                    break;
                case 66 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:535: '\\')\\''
                    {
                    match("')'"); 


                    }
                    break;
                case 67 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:543: '\\'+\\''
                    {
                    match("'+'"); 


                    }
                    break;
                case 68 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:551: '\\',\\''
                    {
                    match("','"); 


                    }
                    break;
                case 69 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:559: '\\'-\\''
                    {
                    match("'-'"); 


                    }
                    break;
                case 70 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:567: '\\'.\\''
                    {
                    match("'.'"); 


                    }
                    break;
                case 71 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:575: '\\'/\\''
                    {
                    match("'/'"); 


                    }
                    break;
                case 72 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:583: '\\':\\''
                    {
                    match("':'"); 


                    }
                    break;
                case 73 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:591: '\\';\\''
                    {
                    match("';'"); 


                    }
                    break;
                case 74 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:599: '\\'<\\''
                    {
                    match("'<'"); 


                    }
                    break;
                case 75 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:607: '\\'=\\''
                    {
                    match("'='"); 


                    }
                    break;
                case 76 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:615: '\\'>\\''
                    {
                    match("'>'"); 


                    }
                    break;
                case 77 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:623: '\\'|\\''
                    {
                    match("'|'"); 


                    }
                    break;
                case 78 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:631: '\\' \\''
                    {
                    match("' '"); 


                    }
                    break;
                case 79 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:639: '\\'#\\''
                    {
                    match("'#'"); 


                    }
                    break;
                case 80 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:647: '\\'[\\''
                    {
                    match("'['"); 


                    }
                    break;
                case 81 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:655: '\\']\\''
                    {
                    match("']'"); 


                    }
                    break;
                case 82 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:663: '\\'_\\''
                    {
                    match("'_'"); 


                    }
                    break;
                case 83 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:671: '\\'*\\''
                    {
                    match("'*'"); 


                    }
                    break;
                case 84 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:679: '\\'\"\\''
                    {
                    match("'\"'"); 


                    }
                    break;
                case 85 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:687: '\\'!\\''
                    {
                    match("'!'"); 


                    }
                    break;
                case 86 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:695: '\\'$\\''
                    {
                    match("'$'"); 


                    }
                    break;
                case 87 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:703: '\\'%\\''
                    {
                    match("'%'"); 


                    }
                    break;
                case 88 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:711: '\\'@\\''
                    {
                    match("'@'"); 


                    }
                    break;
                case 89 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:719: '\\'?\\''
                    {
                    match("'?'"); 


                    }
                    break;
                case 90 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:727: '\\'^\\''
                    {
                    match("'^'"); 


                    }
                    break;
                case 91 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:735: '\\'`\\''
                    {
                    match("'`'"); 


                    }
                    break;
                case 92 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:743: '\\'{\\''
                    {
                    match("'{'"); 


                    }
                    break;
                case 93 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:751: '\\'}\\''
                    {
                    match("'}'"); 


                    }
                    break;
                case 94 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:759: '\\'~\\''
                    {
                    match("'~'"); 


                    }
                    break;
                case 95 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:767: '\\'\\u00A0\\''
                    {
                    match("'\u00A0'"); 


                    }
                    break;
                case 96 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:780: '\\'\\u00A1\\''
                    {
                    match("'\u00A1'"); 


                    }
                    break;
                case 97 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:793: '\\'\\u00A2\\''
                    {
                    match("'\u00A2'"); 


                    }
                    break;
                case 98 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:806: '\\'\\u00A3\\''
                    {
                    match("'\u00A3'"); 


                    }
                    break;
                case 99 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:819: '\\'\\u20AC\\''
                    {
                    match("'\u20AC'"); 


                    }
                    break;
                case 100 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:832: '\\'\\u00A5\\''
                    {
                    match("'\u00A5'"); 


                    }
                    break;
                case 101 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:845: '\\'\\u0160\\''
                    {
                    match("'\u0160'"); 


                    }
                    break;
                case 102 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:858: '\\'\\u00A7\\''
                    {
                    match("'\u00A7'"); 


                    }
                    break;
                case 103 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:871: '\\'\\u0161\\''
                    {
                    match("'\u0161'"); 


                    }
                    break;
                case 104 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:884: '\\'\\u00A9\\''
                    {
                    match("'\u00A9'"); 


                    }
                    break;
                case 105 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:897: '\\'\\u00AA\\''
                    {
                    match("'\u00AA'"); 


                    }
                    break;
                case 106 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:910: '\\'\\u00AB\\''
                    {
                    match("'\u00AB'"); 


                    }
                    break;
                case 107 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:923: '\\'\\u00AC\\''
                    {
                    match("'\u00AC'"); 


                    }
                    break;
                case 108 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:936: '\\'\\''
                    {
                    match("''"); 


                    }
                    break;
                case 109 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:943: '\\'\\u00AE\\''
                    {
                    match("'\u00AE'"); 


                    }
                    break;
                case 110 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:956: '\\'\\u00AF\\''
                    {
                    match("'\u00AF'"); 


                    }
                    break;
                case 111 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:969: '\\'\\u00B0\\''
                    {
                    match("'\u00B0'"); 


                    }
                    break;
                case 112 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:982: '\\'\\u00B1\\''
                    {
                    match("'\u00B1'"); 


                    }
                    break;
                case 113 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:995: '\\'\\u00B2\\''
                    {
                    match("'\u00B2'"); 


                    }
                    break;
                case 114 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1008: '\\'\\u00B3\\''
                    {
                    match("'\u00B3'"); 


                    }
                    break;
                case 115 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1021: '\\'\\u017D\\''
                    {
                    match("'\u017D'"); 


                    }
                    break;
                case 116 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1034: '\\'\\u00B5\\''
                    {
                    match("'\u00B5'"); 


                    }
                    break;
                case 117 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1047: '\\'\\u00B6\\''
                    {
                    match("'\u00B6'"); 


                    }
                    break;
                case 118 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1060: '\\'\\u00B7\\''
                    {
                    match("'\u00B7'"); 


                    }
                    break;
                case 119 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1073: '\\'\\u017E\\''
                    {
                    match("'\u017E'"); 


                    }
                    break;
                case 120 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1086: '\\'\\u00B9\\''
                    {
                    match("'\u00B9'"); 


                    }
                    break;
                case 121 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1099: '\\'\\u00BA\\''
                    {
                    match("'\u00BA'"); 


                    }
                    break;
                case 122 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1112: '\\'\\u00BB\\''
                    {
                    match("'\u00BB'"); 


                    }
                    break;
                case 123 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1125: '\\'\\u0152\\''
                    {
                    match("'\u0152'"); 


                    }
                    break;
                case 124 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1138: '\\'\\u0153\\''
                    {
                    match("'\u0153'"); 


                    }
                    break;
                case 125 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1151: '\\'\\u0178\\''
                    {
                    match("'\u0178'"); 


                    }
                    break;
                case 126 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1164: '\\'\\u00BF\\''
                    {
                    match("'\u00BF'"); 


                    }
                    break;
                case 127 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1177: '\\'\\u00C0\\''
                    {
                    match("'\u00C0'"); 


                    }
                    break;
                case 128 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1190: '\\'\\u00C1\\''
                    {
                    match("'\u00C1'"); 


                    }
                    break;
                case 129 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1203: '\\'\\u00C2\\''
                    {
                    match("'\u00C2'"); 


                    }
                    break;
                case 130 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1216: '\\'\\u00C3\\''
                    {
                    match("'\u00C3'"); 


                    }
                    break;
                case 131 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1229: '\\'\\u00C4\\''
                    {
                    match("'\u00C4'"); 


                    }
                    break;
                case 132 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1242: '\\'\\u00C5\\''
                    {
                    match("'\u00C5'"); 


                    }
                    break;
                case 133 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1255: '\\'\\u00C6\\''
                    {
                    match("'\u00C6'"); 


                    }
                    break;
                case 134 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1268: '\\'\\u00C7\\''
                    {
                    match("'\u00C7'"); 


                    }
                    break;
                case 135 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1281: '\\'\\u00C8\\''
                    {
                    match("'\u00C8'"); 


                    }
                    break;
                case 136 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1294: '\\'\\u00C9\\''
                    {
                    match("'\u00C9'"); 


                    }
                    break;
                case 137 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1307: '\\'\\u00CA\\''
                    {
                    match("'\u00CA'"); 


                    }
                    break;
                case 138 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1320: '\\'\\u00CB\\''
                    {
                    match("'\u00CB'"); 


                    }
                    break;
                case 139 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1333: '\\'\\u00CC\\''
                    {
                    match("'\u00CC'"); 


                    }
                    break;
                case 140 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1346: '\\'\\u00CD\\''
                    {
                    match("'\u00CD'"); 


                    }
                    break;
                case 141 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1359: '\\'\\u00CE\\''
                    {
                    match("'\u00CE'"); 


                    }
                    break;
                case 142 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1372: '\\'\\u00CF\\''
                    {
                    match("'\u00CF'"); 


                    }
                    break;
                case 143 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1385: '\\'\\u00D0\\''
                    {
                    match("'\u00D0'"); 


                    }
                    break;
                case 144 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1398: '\\'\\u00D1\\''
                    {
                    match("'\u00D1'"); 


                    }
                    break;
                case 145 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1411: '\\'\\u00D2\\''
                    {
                    match("'\u00D2'"); 


                    }
                    break;
                case 146 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1424: '\\'\\u00D3\\''
                    {
                    match("'\u00D3'"); 


                    }
                    break;
                case 147 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1437: '\\'\\u00D4\\''
                    {
                    match("'\u00D4'"); 


                    }
                    break;
                case 148 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1450: '\\'\\u00D5\\''
                    {
                    match("'\u00D5'"); 


                    }
                    break;
                case 149 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1463: '\\'\\u00D6\\''
                    {
                    match("'\u00D6'"); 


                    }
                    break;
                case 150 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1476: '\\'\\u00D7\\''
                    {
                    match("'\u00D7'"); 


                    }
                    break;
                case 151 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1489: '\\'\\u00D8\\''
                    {
                    match("'\u00D8'"); 


                    }
                    break;
                case 152 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1502: '\\'\\u00D9\\''
                    {
                    match("'\u00D9'"); 


                    }
                    break;
                case 153 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1515: '\\'\\u00DA\\''
                    {
                    match("'\u00DA'"); 


                    }
                    break;
                case 154 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1528: '\\'\\u00DB\\''
                    {
                    match("'\u00DB'"); 


                    }
                    break;
                case 155 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1541: '\\'\\u00DC\\''
                    {
                    match("'\u00DC'"); 


                    }
                    break;
                case 156 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1554: '\\'\\u00DD\\''
                    {
                    match("'\u00DD'"); 


                    }
                    break;
                case 157 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1567: '\\'\\u00DE\\''
                    {
                    match("'\u00DE'"); 


                    }
                    break;
                case 158 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1580: '\\'\\u00DF\\''
                    {
                    match("'\u00DF'"); 


                    }
                    break;
                case 159 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1593: '\\'\\u00E0\\''
                    {
                    match("'\u00E0'"); 


                    }
                    break;
                case 160 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1606: '\\'\\u00E1\\''
                    {
                    match("'\u00E1'"); 


                    }
                    break;
                case 161 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1619: '\\'\\u00E2\\''
                    {
                    match("'\u00E2'"); 


                    }
                    break;
                case 162 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1632: '\\'\\u00E3\\''
                    {
                    match("'\u00E3'"); 


                    }
                    break;
                case 163 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1645: '\\'\\u00E4\\''
                    {
                    match("'\u00E4'"); 


                    }
                    break;
                case 164 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1658: '\\'\\u00E5\\''
                    {
                    match("'\u00E5'"); 


                    }
                    break;
                case 165 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1671: '\\'\\u00E6\\''
                    {
                    match("'\u00E6'"); 


                    }
                    break;
                case 166 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1684: '\\'\\u00E7\\''
                    {
                    match("'\u00E7'"); 


                    }
                    break;
                case 167 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1697: '\\'\\u00E8\\''
                    {
                    match("'\u00E8'"); 


                    }
                    break;
                case 168 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1710: '\\'\\u00E9\\''
                    {
                    match("'\u00E9'"); 


                    }
                    break;
                case 169 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1723: '\\'\\u00EA\\''
                    {
                    match("'\u00EA'"); 


                    }
                    break;
                case 170 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1736: '\\'\\u00EB\\''
                    {
                    match("'\u00EB'"); 


                    }
                    break;
                case 171 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1749: '\\'\\u00EC\\''
                    {
                    match("'\u00EC'"); 


                    }
                    break;
                case 172 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1762: '\\'\\u00ED\\''
                    {
                    match("'\u00ED'"); 


                    }
                    break;
                case 173 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1775: '\\'\\u00EE\\''
                    {
                    match("'\u00EE'"); 


                    }
                    break;
                case 174 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1788: '\\'\\u00EF\\''
                    {
                    match("'\u00EF'"); 


                    }
                    break;
                case 175 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1801: '\\'\\u00F0\\''
                    {
                    match("'\u00F0'"); 


                    }
                    break;
                case 176 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1814: '\\'\\u00F1\\''
                    {
                    match("'\u00F1'"); 


                    }
                    break;
                case 177 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1827: '\\'\\u00F2\\''
                    {
                    match("'\u00F2'"); 


                    }
                    break;
                case 178 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1840: '\\'\\u00F3\\''
                    {
                    match("'\u00F3'"); 


                    }
                    break;
                case 179 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1853: '\\'\\u00F4\\''
                    {
                    match("'\u00F4'"); 


                    }
                    break;
                case 180 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1866: '\\'\\u00F5\\''
                    {
                    match("'\u00F5'"); 


                    }
                    break;
                case 181 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1879: '\\'\\u00F6\\''
                    {
                    match("'\u00F6'"); 


                    }
                    break;
                case 182 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1892: '\\'\\u00F7\\''
                    {
                    match("'\u00F7'"); 


                    }
                    break;
                case 183 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1905: '\\'\\u00F8\\''
                    {
                    match("'\u00F8'"); 


                    }
                    break;
                case 184 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1918: '\\'\\u00F9\\''
                    {
                    match("'\u00F9'"); 


                    }
                    break;
                case 185 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1931: '\\'\\u00FA\\''
                    {
                    match("'\u00FA'"); 


                    }
                    break;
                case 186 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1944: '\\'\\u00FB\\''
                    {
                    match("'\u00FB'"); 


                    }
                    break;
                case 187 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1957: '\\'\\u00FC\\''
                    {
                    match("'\u00FC'"); 


                    }
                    break;
                case 188 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1970: '\\'\\u00FD\\''
                    {
                    match("'\u00FD'"); 


                    }
                    break;
                case 189 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1983: '\\'\\u00FE\\''
                    {
                    match("'\u00FE'"); 


                    }
                    break;
                case 190 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:301:1996: '\\'\\u00FF\\''
                    {
                    match("'\u00FF'"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_ATTRIBUTE"
    public final void mRULE_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:303:16: ( '\\'' RULE_LETTER_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )* )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:303:18: '\\'' RULE_LETTER_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            {
            match('\''); 
            mRULE_LETTER_FRAGMENT(); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:303:44: ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATTRIBUTE"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:41: ( '\\r' )? '\\n'
                    {
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:305:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:307:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_BASED_INTEGER_FRAGMENT"
    public final void mRULE_BASED_INTEGER_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:309:38: ( RULE_LETTER_OR_DIGIT_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )* )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:309:40: RULE_LETTER_OR_DIGIT_FRAGMENT ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            {
            mRULE_LETTER_OR_DIGIT_FRAGMENT(); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:309:70: ( '_' | RULE_LETTER_OR_DIGIT_FRAGMENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER_FRAGMENT"

    // $ANTLR start "RULE_LETTER_OR_DIGIT_FRAGMENT"
    public final void mRULE_LETTER_OR_DIGIT_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:311:40: ( ( RULE_LETTER_FRAGMENT | RULE_DIGIT_FRAGMENT ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:311:42: ( RULE_LETTER_FRAGMENT | RULE_DIGIT_FRAGMENT )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_OR_DIGIT_FRAGMENT"

    // $ANTLR start "RULE_LETTER_FRAGMENT"
    public final void mRULE_LETTER_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:313:31: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:313:33: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_FRAGMENT"

    // $ANTLR start "RULE_BASE_SPECIFIER_FRAGMENT"
    public final void mRULE_BASE_SPECIFIER_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:39: ( ( 'B' | 'O' | 'X' | 'UB' | 'UO' | 'UX' | 'SB' | 'SO' | 'SX' | 'D' | 'b' | 'o' | 'x' | 'ub' | 'uo' | 'ux' | 'sb' | 'so' | 'sx' | 'd' ) )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:41: ( 'B' | 'O' | 'X' | 'UB' | 'UO' | 'UX' | 'SB' | 'SO' | 'SX' | 'D' | 'b' | 'o' | 'x' | 'ub' | 'uo' | 'ux' | 'sb' | 'so' | 'sx' | 'd' )
            {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:41: ( 'B' | 'O' | 'X' | 'UB' | 'UO' | 'UX' | 'SB' | 'SO' | 'SX' | 'D' | 'b' | 'o' | 'x' | 'ub' | 'uo' | 'ux' | 'sb' | 'so' | 'sx' | 'd' )
            int alt17=20;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:42: 'B'
                    {
                    match('B'); 

                    }
                    break;
                case 2 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:46: 'O'
                    {
                    match('O'); 

                    }
                    break;
                case 3 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:50: 'X'
                    {
                    match('X'); 

                    }
                    break;
                case 4 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:54: 'UB'
                    {
                    match("UB"); 


                    }
                    break;
                case 5 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:59: 'UO'
                    {
                    match("UO"); 


                    }
                    break;
                case 6 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:64: 'UX'
                    {
                    match("UX"); 


                    }
                    break;
                case 7 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:69: 'SB'
                    {
                    match("SB"); 


                    }
                    break;
                case 8 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:74: 'SO'
                    {
                    match("SO"); 


                    }
                    break;
                case 9 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:79: 'SX'
                    {
                    match("SX"); 


                    }
                    break;
                case 10 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:84: 'D'
                    {
                    match('D'); 

                    }
                    break;
                case 11 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:88: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 12 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:92: 'o'
                    {
                    match('o'); 

                    }
                    break;
                case 13 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:96: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 14 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:100: 'ub'
                    {
                    match("ub"); 


                    }
                    break;
                case 15 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:105: 'uo'
                    {
                    match("uo"); 


                    }
                    break;
                case 16 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:110: 'ux'
                    {
                    match("ux"); 


                    }
                    break;
                case 17 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:115: 'sb'
                    {
                    match("sb"); 


                    }
                    break;
                case 18 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:120: 'so'
                    {
                    match("so"); 


                    }
                    break;
                case 19 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:125: 'sx'
                    {
                    match("sx"); 


                    }
                    break;
                case 20 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:315:130: 'd'
                    {
                    match('d'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASE_SPECIFIER_FRAGMENT"

    // $ANTLR start "RULE_EXPONENT_FRAGMENT"
    public final void mRULE_EXPONENT_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:317:33: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_INTEGER_FRAGMENT )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:317:35: ( 'E' | 'e' ) ( '+' | '-' )? RULE_INTEGER_FRAGMENT
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:317:45: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INTEGER_FRAGMENT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT_FRAGMENT"

    // $ANTLR start "RULE_INTEGER_FRAGMENT"
    public final void mRULE_INTEGER_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:319:32: ( RULE_DIGIT_FRAGMENT ( '_' | RULE_DIGIT_FRAGMENT )* )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:319:34: RULE_DIGIT_FRAGMENT ( '_' | RULE_DIGIT_FRAGMENT )*
            {
            mRULE_DIGIT_FRAGMENT(); 
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:319:54: ( '_' | RULE_DIGIT_FRAGMENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||LA19_0=='_') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_FRAGMENT"

    // $ANTLR start "RULE_DIGIT_FRAGMENT"
    public final void mRULE_DIGIT_FRAGMENT() throws RecognitionException {
        try {
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:321:30: ( '0' .. '9' )
            // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:321:32: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_FRAGMENT"

    public void mTokens() throws RecognitionException {
        // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:8: ( Configuration | Architecture | Disconnect | Procedural | Unaffected | Attribute | Component | Postponed | Procedure | Reference | Subnature | Tolerance | Transport | Constant | Function | Generate | Inertial | Quantity | Register | Severity | Spectrum | Terminal | Variable | Generic | Guarded | Library | Linkage | Literal | Package | Process | Subtype | Through | Access | Across | Assert | Buffer | Downto | Entity | Impure | Nature | Others | Record | Reject | Report | Return | Select | Shared | Signal | After | Alias | Array | Begin | Block | Break | Elsif | Group | Inout | Label | Limit | Noise | Range | Units | Until | While | Body | Case | Else | Exit | File | Loop | Nand | Next | Null | Open | Port | Pure | Then | Type | Wait | When | With | Xnor | Abs | All | And | Bus | End | For | Map | Mod | New | Nor | Not | Out | Rem | Rol | Ror | Sla | Sll | Sra | Srl | Use | Xor | AsteriskAsterisk | SolidusEqualsSign | ColonEqualsSign | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | If | In | Is | Of | On | Or | To | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | VerticalLine | RULE_ABSTRACT_LITERAL | RULE_BIT_STRING_LITERAL | RULE_ID | RULE_EXTENDED_IDENTIFIER | RULE_STRING | RULE_CHAR | RULE_ATTRIBUTE | RULE_SL_COMMENT | RULE_WS )
        int alt20=144;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:10: Configuration
                {
                mConfiguration(); 

                }
                break;
            case 2 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:24: Architecture
                {
                mArchitecture(); 

                }
                break;
            case 3 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:37: Disconnect
                {
                mDisconnect(); 

                }
                break;
            case 4 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:48: Procedural
                {
                mProcedural(); 

                }
                break;
            case 5 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:59: Unaffected
                {
                mUnaffected(); 

                }
                break;
            case 6 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:70: Attribute
                {
                mAttribute(); 

                }
                break;
            case 7 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:80: Component
                {
                mComponent(); 

                }
                break;
            case 8 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:90: Postponed
                {
                mPostponed(); 

                }
                break;
            case 9 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:100: Procedure
                {
                mProcedure(); 

                }
                break;
            case 10 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:110: Reference
                {
                mReference(); 

                }
                break;
            case 11 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:120: Subnature
                {
                mSubnature(); 

                }
                break;
            case 12 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:130: Tolerance
                {
                mTolerance(); 

                }
                break;
            case 13 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:140: Transport
                {
                mTransport(); 

                }
                break;
            case 14 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:150: Constant
                {
                mConstant(); 

                }
                break;
            case 15 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:159: Function
                {
                mFunction(); 

                }
                break;
            case 16 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:168: Generate
                {
                mGenerate(); 

                }
                break;
            case 17 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:177: Inertial
                {
                mInertial(); 

                }
                break;
            case 18 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:186: Quantity
                {
                mQuantity(); 

                }
                break;
            case 19 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:195: Register
                {
                mRegister(); 

                }
                break;
            case 20 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:204: Severity
                {
                mSeverity(); 

                }
                break;
            case 21 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:213: Spectrum
                {
                mSpectrum(); 

                }
                break;
            case 22 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:222: Terminal
                {
                mTerminal(); 

                }
                break;
            case 23 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:231: Variable
                {
                mVariable(); 

                }
                break;
            case 24 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:240: Generic
                {
                mGeneric(); 

                }
                break;
            case 25 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:248: Guarded
                {
                mGuarded(); 

                }
                break;
            case 26 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:256: Library
                {
                mLibrary(); 

                }
                break;
            case 27 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:264: Linkage
                {
                mLinkage(); 

                }
                break;
            case 28 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:272: Literal
                {
                mLiteral(); 

                }
                break;
            case 29 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:280: Package
                {
                mPackage(); 

                }
                break;
            case 30 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:288: Process
                {
                mProcess(); 

                }
                break;
            case 31 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:296: Subtype
                {
                mSubtype(); 

                }
                break;
            case 32 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:304: Through
                {
                mThrough(); 

                }
                break;
            case 33 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:312: Access
                {
                mAccess(); 

                }
                break;
            case 34 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:319: Across
                {
                mAcross(); 

                }
                break;
            case 35 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:326: Assert
                {
                mAssert(); 

                }
                break;
            case 36 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:333: Buffer
                {
                mBuffer(); 

                }
                break;
            case 37 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:340: Downto
                {
                mDownto(); 

                }
                break;
            case 38 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:347: Entity
                {
                mEntity(); 

                }
                break;
            case 39 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:354: Impure
                {
                mImpure(); 

                }
                break;
            case 40 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:361: Nature
                {
                mNature(); 

                }
                break;
            case 41 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:368: Others
                {
                mOthers(); 

                }
                break;
            case 42 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:375: Record
                {
                mRecord(); 

                }
                break;
            case 43 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:382: Reject
                {
                mReject(); 

                }
                break;
            case 44 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:389: Report
                {
                mReport(); 

                }
                break;
            case 45 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:396: Return
                {
                mReturn(); 

                }
                break;
            case 46 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:403: Select
                {
                mSelect(); 

                }
                break;
            case 47 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:410: Shared
                {
                mShared(); 

                }
                break;
            case 48 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:417: Signal
                {
                mSignal(); 

                }
                break;
            case 49 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:424: After
                {
                mAfter(); 

                }
                break;
            case 50 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:430: Alias
                {
                mAlias(); 

                }
                break;
            case 51 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:436: Array
                {
                mArray(); 

                }
                break;
            case 52 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:442: Begin
                {
                mBegin(); 

                }
                break;
            case 53 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:448: Block
                {
                mBlock(); 

                }
                break;
            case 54 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:454: Break
                {
                mBreak(); 

                }
                break;
            case 55 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:460: Elsif
                {
                mElsif(); 

                }
                break;
            case 56 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:466: Group
                {
                mGroup(); 

                }
                break;
            case 57 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:472: Inout
                {
                mInout(); 

                }
                break;
            case 58 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:478: Label
                {
                mLabel(); 

                }
                break;
            case 59 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:484: Limit
                {
                mLimit(); 

                }
                break;
            case 60 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:490: Noise
                {
                mNoise(); 

                }
                break;
            case 61 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:496: Range
                {
                mRange(); 

                }
                break;
            case 62 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:502: Units
                {
                mUnits(); 

                }
                break;
            case 63 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:508: Until
                {
                mUntil(); 

                }
                break;
            case 64 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:514: While
                {
                mWhile(); 

                }
                break;
            case 65 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:520: Body
                {
                mBody(); 

                }
                break;
            case 66 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:525: Case
                {
                mCase(); 

                }
                break;
            case 67 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:530: Else
                {
                mElse(); 

                }
                break;
            case 68 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:535: Exit
                {
                mExit(); 

                }
                break;
            case 69 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:540: File
                {
                mFile(); 

                }
                break;
            case 70 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:545: Loop
                {
                mLoop(); 

                }
                break;
            case 71 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:550: Nand
                {
                mNand(); 

                }
                break;
            case 72 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:555: Next
                {
                mNext(); 

                }
                break;
            case 73 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:560: Null
                {
                mNull(); 

                }
                break;
            case 74 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:565: Open
                {
                mOpen(); 

                }
                break;
            case 75 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:570: Port
                {
                mPort(); 

                }
                break;
            case 76 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:575: Pure
                {
                mPure(); 

                }
                break;
            case 77 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:580: Then
                {
                mThen(); 

                }
                break;
            case 78 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:585: Type
                {
                mType(); 

                }
                break;
            case 79 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:590: Wait
                {
                mWait(); 

                }
                break;
            case 80 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:595: When
                {
                mWhen(); 

                }
                break;
            case 81 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:600: With
                {
                mWith(); 

                }
                break;
            case 82 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:605: Xnor
                {
                mXnor(); 

                }
                break;
            case 83 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:610: Abs
                {
                mAbs(); 

                }
                break;
            case 84 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:614: All
                {
                mAll(); 

                }
                break;
            case 85 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:618: And
                {
                mAnd(); 

                }
                break;
            case 86 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:622: Bus
                {
                mBus(); 

                }
                break;
            case 87 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:626: End
                {
                mEnd(); 

                }
                break;
            case 88 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:630: For
                {
                mFor(); 

                }
                break;
            case 89 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:634: Map
                {
                mMap(); 

                }
                break;
            case 90 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:638: Mod
                {
                mMod(); 

                }
                break;
            case 91 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:642: New
                {
                mNew(); 

                }
                break;
            case 92 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:646: Nor
                {
                mNor(); 

                }
                break;
            case 93 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:650: Not
                {
                mNot(); 

                }
                break;
            case 94 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:654: Out
                {
                mOut(); 

                }
                break;
            case 95 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:658: Rem
                {
                mRem(); 

                }
                break;
            case 96 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:662: Rol
                {
                mRol(); 

                }
                break;
            case 97 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:666: Ror
                {
                mRor(); 

                }
                break;
            case 98 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:670: Sla
                {
                mSla(); 

                }
                break;
            case 99 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:674: Sll
                {
                mSll(); 

                }
                break;
            case 100 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:678: Sra
                {
                mSra(); 

                }
                break;
            case 101 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:682: Srl
                {
                mSrl(); 

                }
                break;
            case 102 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:686: Use
                {
                mUse(); 

                }
                break;
            case 103 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:690: Xor
                {
                mXor(); 

                }
                break;
            case 104 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:694: AsteriskAsterisk
                {
                mAsteriskAsterisk(); 

                }
                break;
            case 105 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:711: SolidusEqualsSign
                {
                mSolidusEqualsSign(); 

                }
                break;
            case 106 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:729: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 107 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:745: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 108 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:768: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 109 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:796: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 110 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:817: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 111 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:843: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 112 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:869: If
                {
                mIf(); 

                }
                break;
            case 113 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:872: In
                {
                mIn(); 

                }
                break;
            case 114 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:875: Is
                {
                mIs(); 

                }
                break;
            case 115 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:878: Of
                {
                mOf(); 

                }
                break;
            case 116 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:881: On
                {
                mOn(); 

                }
                break;
            case 117 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:884: Or
                {
                mOr(); 

                }
                break;
            case 118 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:887: To
                {
                mTo(); 

                }
                break;
            case 119 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:890: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 120 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:900: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 121 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:916: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 122 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:933: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 123 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:942: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 124 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:951: Comma
                {
                mComma(); 

                }
                break;
            case 125 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:957: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 126 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:969: FullStop
                {
                mFullStop(); 

                }
                break;
            case 127 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:978: Solidus
                {
                mSolidus(); 

                }
                break;
            case 128 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:986: Colon
                {
                mColon(); 

                }
                break;
            case 129 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:992: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 130 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1002: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 131 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1015: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 132 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1026: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 133 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1042: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 134 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1060: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 135 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1079: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 136 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1092: RULE_ABSTRACT_LITERAL
                {
                mRULE_ABSTRACT_LITERAL(); 

                }
                break;
            case 137 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1114: RULE_BIT_STRING_LITERAL
                {
                mRULE_BIT_STRING_LITERAL(); 

                }
                break;
            case 138 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 139 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1146: RULE_EXTENDED_IDENTIFIER
                {
                mRULE_EXTENDED_IDENTIFIER(); 

                }
                break;
            case 140 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1171: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 141 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1183: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 142 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1193: RULE_ATTRIBUTE
                {
                mRULE_ATTRIBUTE(); 

                }
                break;
            case 143 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1208: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 144 :
                // ../net.mlanoe.language.vhdl.xtext/src-gen/net/mlanoe/language/vhdl/xtext/parser/antlr/lexer/InternalVhdlLexer.g:1:1224: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA10_eotS =
        "\101\uffff\1\u00c0\177\uffff";
    static final String DFA10_eofS =
        "\u00c1\uffff";
    static final String DFA10_minS =
        "\1\47\1\40\77\uffff\1\47\177\uffff";
    static final String DFA10_maxS =
        "\1\47\1\u20ac\77\uffff\1\47\177\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\100\1\154";
    static final String DFA10_specialS =
        "\u00c1\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\117\1\126\1\125\1\120\1\127\1\130\1\100\1\101\1\102\1\103\1\124\1\104\1\105\1\106\1\107\1\110\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\111\1\112\1\113\1\114\1\115\1\132\1\131\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\121\1\uffff\1\122\1\133\1\123\1\134\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\135\1\116\1\136\1\137\41\uffff\1\140\1\141\1\142\1\143\1\uffff\1\145\1\uffff\1\147\1\uffff\1\151\1\152\1\153\1\154\1\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1\uffff\1\164\1\165\1\166\1\uffff\1\170\1\171\1\172\3\uffff\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\122\uffff\1\173\1\174\14\uffff\1\146\1\150\26\uffff\1\175\4\uffff\1\163\1\167\u1f2d\uffff\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "301:13: ( '\\'a\\'' | '\\'b\\'' | '\\'c\\'' | '\\'d\\'' | '\\'e\\'' | '\\'f\\'' | '\\'g\\'' | '\\'h\\'' | '\\'i\\'' | '\\'j\\'' | '\\'k\\'' | '\\'l\\'' | '\\'m\\'' | '\\'n\\'' | '\\'o\\'' | '\\'p\\'' | '\\'q\\'' | '\\'r\\'' | '\\'s\\'' | '\\'t\\'' | '\\'u\\'' | '\\'v\\'' | '\\'w\\'' | '\\'x\\'' | '\\'y\\'' | '\\'z\\'' | '\\'A\\'' | '\\'B\\'' | '\\'C\\'' | '\\'D\\'' | '\\'E\\'' | '\\'F\\'' | '\\'G\\'' | '\\'H\\'' | '\\'I\\'' | '\\'J\\'' | '\\'K\\'' | '\\'L\\'' | '\\'M\\'' | '\\'N\\'' | '\\'O\\'' | '\\'P\\'' | '\\'Q\\'' | '\\'R\\'' | '\\'S\\'' | '\\'T\\'' | '\\'U\\'' | '\\'V\\'' | '\\'W\\'' | '\\'X\\'' | '\\'Y\\'' | '\\'Z\\'' | '\\'0\\'' | '\\'1\\'' | '\\'2\\'' | '\\'3\\'' | '\\'4\\'' | '\\'5\\'' | '\\'6\\'' | '\\'7\\'' | '\\'8\\'' | '\\'9\\'' | '\\'&\\'' | '\\'\\'\\'' | '\\'(\\'' | '\\')\\'' | '\\'+\\'' | '\\',\\'' | '\\'-\\'' | '\\'.\\'' | '\\'/\\'' | '\\':\\'' | '\\';\\'' | '\\'<\\'' | '\\'=\\'' | '\\'>\\'' | '\\'|\\'' | '\\' \\'' | '\\'#\\'' | '\\'[\\'' | '\\']\\'' | '\\'_\\'' | '\\'*\\'' | '\\'\"\\'' | '\\'!\\'' | '\\'$\\'' | '\\'%\\'' | '\\'@\\'' | '\\'?\\'' | '\\'^\\'' | '\\'`\\'' | '\\'{\\'' | '\\'}\\'' | '\\'~\\'' | '\\'\\u00A0\\'' | '\\'\\u00A1\\'' | '\\'\\u00A2\\'' | '\\'\\u00A3\\'' | '\\'\\u20AC\\'' | '\\'\\u00A5\\'' | '\\'\\u0160\\'' | '\\'\\u00A7\\'' | '\\'\\u0161\\'' | '\\'\\u00A9\\'' | '\\'\\u00AA\\'' | '\\'\\u00AB\\'' | '\\'\\u00AC\\'' | '\\'\\'' | '\\'\\u00AE\\'' | '\\'\\u00AF\\'' | '\\'\\u00B0\\'' | '\\'\\u00B1\\'' | '\\'\\u00B2\\'' | '\\'\\u00B3\\'' | '\\'\\u017D\\'' | '\\'\\u00B5\\'' | '\\'\\u00B6\\'' | '\\'\\u00B7\\'' | '\\'\\u017E\\'' | '\\'\\u00B9\\'' | '\\'\\u00BA\\'' | '\\'\\u00BB\\'' | '\\'\\u0152\\'' | '\\'\\u0153\\'' | '\\'\\u0178\\'' | '\\'\\u00BF\\'' | '\\'\\u00C0\\'' | '\\'\\u00C1\\'' | '\\'\\u00C2\\'' | '\\'\\u00C3\\'' | '\\'\\u00C4\\'' | '\\'\\u00C5\\'' | '\\'\\u00C6\\'' | '\\'\\u00C7\\'' | '\\'\\u00C8\\'' | '\\'\\u00C9\\'' | '\\'\\u00CA\\'' | '\\'\\u00CB\\'' | '\\'\\u00CC\\'' | '\\'\\u00CD\\'' | '\\'\\u00CE\\'' | '\\'\\u00CF\\'' | '\\'\\u00D0\\'' | '\\'\\u00D1\\'' | '\\'\\u00D2\\'' | '\\'\\u00D3\\'' | '\\'\\u00D4\\'' | '\\'\\u00D5\\'' | '\\'\\u00D6\\'' | '\\'\\u00D7\\'' | '\\'\\u00D8\\'' | '\\'\\u00D9\\'' | '\\'\\u00DA\\'' | '\\'\\u00DB\\'' | '\\'\\u00DC\\'' | '\\'\\u00DD\\'' | '\\'\\u00DE\\'' | '\\'\\u00DF\\'' | '\\'\\u00E0\\'' | '\\'\\u00E1\\'' | '\\'\\u00E2\\'' | '\\'\\u00E3\\'' | '\\'\\u00E4\\'' | '\\'\\u00E5\\'' | '\\'\\u00E6\\'' | '\\'\\u00E7\\'' | '\\'\\u00E8\\'' | '\\'\\u00E9\\'' | '\\'\\u00EA\\'' | '\\'\\u00EB\\'' | '\\'\\u00EC\\'' | '\\'\\u00ED\\'' | '\\'\\u00EE\\'' | '\\'\\u00EF\\'' | '\\'\\u00F0\\'' | '\\'\\u00F1\\'' | '\\'\\u00F2\\'' | '\\'\\u00F3\\'' | '\\'\\u00F4\\'' | '\\'\\u00F5\\'' | '\\'\\u00F6\\'' | '\\'\\u00F7\\'' | '\\'\\u00F8\\'' | '\\'\\u00F9\\'' | '\\'\\u00FA\\'' | '\\'\\u00FB\\'' | '\\'\\u00FC\\'' | '\\'\\u00FD\\'' | '\\'\\u00FE\\'' | '\\'\\u00FF\\'' )";
        }
    }
    static final String DFA17_eotS =
        "\31\uffff";
    static final String DFA17_eofS =
        "\31\uffff";
    static final String DFA17_minS =
        "\1\102\3\uffff\2\102\4\uffff\2\142\15\uffff";
    static final String DFA17_maxS =
        "\1\170\3\uffff\2\130\4\uffff\2\170\15\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\12\1\13\1\14\1\15\2\uffff\1\24\1\4\1\5\1\6\1\7\1\10\1\11\1\16\1\17\1\20\1\21\1\22\1\23";
    static final String DFA17_specialS =
        "\31\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\uffff\1\6\12\uffff\1\2\3\uffff\1\5\1\uffff\1\4\2\uffff\1\3\11\uffff\1\7\1\uffff\1\14\12\uffff\1\10\3\uffff\1\13\1\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "",
            "\1\15\14\uffff\1\16\10\uffff\1\17",
            "\1\20\14\uffff\1\21\10\uffff\1\22",
            "",
            "",
            "",
            "",
            "\1\23\14\uffff\1\24\10\uffff\1\25",
            "\1\26\14\uffff\1\27\10\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "315:41: ( 'B' | 'O' | 'X' | 'UB' | 'UO' | 'UX' | 'SB' | 'SO' | 'SX' | 'D' | 'b' | 'o' | 'x' | 'ub' | 'uo' | 'ux' | 'sb' | 'so' | 'sx' | 'd' )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\25\56\1\u0084\1\u0086\1\u0088\1\u008b\1\u008e\1\u0090\5\uffff\1\u0092\5\uffff\1\u0093\6\56\5\uffff\14\56\1\uffff\26\56\1\u00fe\12\56\1\u010c\1\56\1\u010e\1\u010f\24\56\1\u012d\1\u012e\1\u012f\7\56\21\uffff\1\u0093\6\56\64\u0138\1\uffff\13\56\1\u0145\1\u0146\1\u0147\12\56\1\u0152\6\56\1\u0159\1\56\1\u015b\1\u015c\6\56\1\u0164\1\u0165\1\u0166\1\u0167\1\56\1\uffff\7\56\1\u0170\5\56\1\uffff\1\56\2\uffff\11\56\1\u0180\5\56\1\u0186\5\56\1\u018d\1\u018e\1\56\1\u0190\3\56\1\u0194\3\uffff\5\56\1\u019a\1\u019b\1\u019c\1\uffff\3\56\1\u01a0\10\56\3\uffff\4\56\1\u01ad\1\56\1\u01af\3\56\1\uffff\6\56\1\uffff\1\56\2\uffff\7\56\4\uffff\4\56\1\u01c5\1\u01c6\1\56\1\u01c8\1\uffff\15\56\1\u01d6\1\56\1\uffff\3\56\1\u01db\1\56\1\uffff\1\56\1\u01de\1\u01df\1\56\1\u01e1\1\56\2\uffff\1\u01e3\1\uffff\1\u01e4\1\56\1\u01e6\1\uffff\1\56\1\u01e8\1\u01e9\1\u01ea\1\u01eb\3\uffff\3\56\1\uffff\1\56\1\u01f0\4\56\1\u01f5\1\u01f6\4\56\1\uffff\1\56\1\uffff\1\56\1\u01fe\1\u01ff\6\56\1\u0206\13\56\2\uffff\1\56\1\uffff\2\56\1\u0216\1\56\1\u0218\6\56\1\u021f\1\u0220\1\uffff\1\56\1\u0222\1\u0223\1\u0224\1\uffff\1\56\1\u0226\2\uffff\1\56\1\uffff\1\u0228\2\uffff\1\56\1\uffff\1\u022a\4\uffff\4\56\1\uffff\1\56\1\u0230\1\u0231\1\u0232\2\uffff\1\56\1\u0234\5\56\2\uffff\2\56\1\u023c\1\u023d\1\u023e\1\u023f\1\uffff\3\56\1\u0243\1\56\1\u0245\1\u0246\10\56\1\uffff\1\56\1\uffff\1\u0250\5\56\2\uffff\1\u0256\3\uffff\1\u0257\1\uffff\1\u0258\1\uffff\1\u0259\1\uffff\5\56\3\uffff\1\56\1\uffff\1\56\1\u0261\1\56\1\u0263\3\56\4\uffff\1\56\1\u0268\1\56\1\uffff\1\56\2\uffff\3\56\1\u026e\2\56\1\u0271\1\u0272\1\56\1\uffff\2\56\1\u0276\1\u0277\1\u0278\4\uffff\1\56\1\u027a\5\56\1\uffff\1\56\1\uffff\2\56\1\u0284\1\56\1\uffff\1\u0286\1\u0287\2\56\1\u028a\1\uffff\1\u028b\1\u028c\2\uffff\1\u028d\1\u028e\1\u028f\3\uffff\1\56\1\uffff\1\u0291\1\56\1\u0293\2\56\1\u0296\1\u0297\1\56\1\u0299\1\uffff\1\u029a\2\uffff\1\u029b\1\u029c\6\uffff\1\56\1\uffff\1\56\1\uffff\1\u029f\1\u02a0\2\uffff\1\u02a1\4\uffff\2\56\3\uffff\1\56\1\u02a5\1\u02a6\2\uffff";
    static final String DFA20_eofS =
        "\u02a7\uffff";
    static final String DFA20_minS =
        "\1\11\1\101\1\102\1\42\1\101\1\102\1\101\1\102\1\105\1\111\1\105\1\106\1\125\2\101\1\42\1\114\1\101\1\42\1\101\1\42\1\101\1\52\5\75\5\uffff\1\55\5\uffff\1\60\3\42\1\116\1\105\1\42\3\uffff\1\40\1\uffff\1\115\1\123\1\103\1\124\1\103\1\123\1\124\1\111\1\123\1\104\1\123\1\127\1\uffff\1\117\1\122\1\103\1\122\1\101\1\105\3\42\1\103\1\116\1\114\1\102\1\114\1\105\1\101\1\107\2\101\3\42\1\60\1\101\1\122\1\105\1\120\1\116\1\114\1\122\1\116\1\101\1\117\1\60\1\120\2\60\1\101\1\122\2\102\1\117\1\106\1\107\1\117\1\105\2\104\1\123\1\111\1\116\1\111\1\127\1\114\1\110\1\105\1\124\3\60\1\105\1\111\1\124\1\117\1\122\1\120\1\104\21\uffff\1\60\6\42\64\47\1\uffff\1\106\1\120\1\105\1\110\1\101\1\122\1\105\1\117\2\105\1\101\3\60\1\103\1\116\1\103\2\124\1\113\1\105\1\106\1\124\1\111\1\60\1\105\1\111\1\117\1\105\1\117\1\125\1\60\1\107\2\60\1\116\2\105\1\103\1\122\1\116\4\60\1\105\1\uffff\1\116\1\115\1\117\1\116\1\105\1\103\1\105\1\60\1\105\1\122\1\125\1\122\1\125\1\uffff\1\125\2\uffff\1\116\1\111\1\122\1\113\1\105\1\111\1\105\1\120\1\106\1\60\1\111\1\103\1\101\1\131\1\111\1\60\1\105\1\124\1\125\1\104\1\123\2\60\1\124\1\60\1\114\1\105\1\116\1\60\3\uffff\1\114\1\116\1\124\1\110\1\122\3\60\1\uffff\1\111\1\124\1\117\1\60\1\111\1\131\1\111\2\123\2\122\1\123\3\uffff\1\117\1\124\1\105\1\120\1\60\1\101\1\60\1\106\1\123\1\114\1\uffff\1\122\1\123\1\122\1\103\2\122\1\uffff\1\105\2\uffff\1\101\1\131\1\122\1\103\1\124\1\105\1\101\4\uffff\1\122\1\123\1\111\1\125\2\60\1\124\1\60\1\uffff\1\122\1\104\1\120\2\124\1\122\1\124\3\101\1\122\1\124\1\114\1\60\1\105\1\uffff\1\116\2\113\1\60\1\124\1\uffff\1\106\2\60\1\122\1\60\1\105\2\uffff\1\60\1\uffff\1\60\1\122\1\60\1\uffff\1\105\4\60\3\uffff\1\107\1\101\1\116\1\uffff\1\124\1\60\1\102\2\123\1\124\2\60\1\116\1\117\1\104\1\117\1\uffff\1\107\1\uffff\1\105\2\60\1\105\1\124\1\104\2\124\1\116\1\60\1\124\1\120\1\111\1\124\1\122\1\104\1\114\1\101\1\120\1\116\1\107\2\uffff\1\111\1\uffff\1\101\1\105\1\60\1\111\1\60\1\105\1\111\1\102\1\122\1\107\1\101\2\60\1\uffff\1\122\3\60\1\uffff\1\131\1\60\2\uffff\1\105\1\uffff\1\60\2\uffff\1\123\1\uffff\1\60\4\uffff\1\125\1\116\2\105\1\uffff\1\125\3\60\2\uffff\1\116\1\60\1\125\1\123\1\116\1\105\1\103\2\uffff\1\116\1\105\4\60\1\uffff\1\125\1\105\1\124\1\60\1\125\2\60\1\116\1\117\1\101\1\110\1\117\1\124\1\103\1\104\1\uffff\1\101\1\uffff\1\60\1\124\1\114\1\131\1\105\1\114\2\uffff\1\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\122\1\124\1\116\1\103\1\124\3\uffff\1\105\1\uffff\1\122\1\60\1\105\1\60\1\124\1\103\1\122\4\uffff\1\122\1\60\1\131\1\uffff\1\115\2\uffff\1\103\1\122\1\114\1\60\1\116\1\105\2\60\1\114\1\uffff\1\131\1\105\3\60\4\uffff\1\101\1\60\2\124\1\105\1\103\1\101\1\uffff\1\104\1\uffff\2\105\1\60\1\105\1\uffff\2\60\1\105\1\124\1\60\1\uffff\2\60\2\uffff\3\60\3\uffff\1\124\1\uffff\1\60\1\125\1\60\1\124\1\114\2\60\1\104\1\60\1\uffff\1\60\2\uffff\2\60\6\uffff\1\111\1\uffff\1\122\1\uffff\2\60\2\uffff\1\60\4\uffff\1\117\1\105\3\uffff\1\116\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\174\1\157\1\164\1\157\1\165\1\163\1\157\1\165\1\171\2\165\1\163\1\165\1\141\1\157\1\165\1\170\2\165\1\151\2\157\1\52\2\75\2\76\1\75\5\uffff\1\55\5\uffff\1\170\2\165\1\157\2\170\1\157\3\uffff\1\u20ac\1\uffff\1\156\1\163\1\162\1\164\1\162\1\163\1\164\1\154\1\163\1\144\1\163\1\167\1\uffff\1\157\1\163\1\143\1\162\1\164\1\145\3\42\1\164\1\156\1\162\1\142\1\166\1\145\1\141\1\147\2\154\3\42\1\172\1\141\2\162\1\160\1\156\1\154\1\162\1\156\1\141\1\157\1\172\1\160\2\172\1\141\1\162\1\164\1\142\1\157\1\163\1\147\1\157\1\145\1\144\1\164\1\163\1\151\2\164\1\170\1\154\1\150\1\145\1\164\3\172\2\151\1\164\1\157\1\162\1\160\1\144\21\uffff\1\170\6\42\64\47\1\uffff\1\163\1\160\1\145\1\150\1\141\1\162\1\145\1\157\2\145\1\141\3\172\1\143\1\156\1\143\2\164\1\153\1\145\1\146\1\164\1\151\1\172\1\145\1\151\1\157\1\145\1\157\1\165\1\172\1\147\2\172\1\164\2\145\1\143\1\162\1\156\4\172\1\145\1\uffff\1\156\1\155\1\157\1\156\1\145\1\143\1\145\1\172\1\145\1\162\1\165\1\162\1\165\1\uffff\1\165\2\uffff\1\156\1\151\1\162\1\153\1\145\1\151\1\145\1\160\1\146\1\172\1\151\1\143\1\141\1\171\1\151\1\172\1\151\1\164\1\165\1\144\1\163\2\172\1\164\1\172\1\154\1\145\1\156\1\172\3\uffff\1\154\1\156\1\164\1\150\1\162\3\172\1\uffff\1\151\1\164\1\157\1\172\1\151\1\171\1\151\2\163\2\162\1\163\3\uffff\1\157\1\164\1\145\1\160\1\172\1\141\1\172\1\146\1\163\1\154\1\uffff\1\162\1\163\1\162\1\143\2\162\1\uffff\1\145\2\uffff\1\141\1\171\1\162\1\143\1\164\1\145\1\141\4\uffff\1\162\1\163\1\151\1\165\2\172\1\164\1\172\1\uffff\1\162\1\144\1\160\2\164\1\162\1\164\3\141\1\162\1\164\1\154\1\172\1\145\1\uffff\1\156\2\153\1\172\1\164\1\uffff\1\146\2\172\1\162\1\172\1\145\2\uffff\1\172\1\uffff\1\172\1\162\1\172\1\uffff\1\145\4\172\3\uffff\1\147\1\141\1\156\1\uffff\1\164\1\172\1\142\2\163\1\164\2\172\1\156\1\157\1\163\1\157\1\uffff\1\147\1\uffff\1\145\2\172\1\145\1\164\1\144\2\164\1\156\1\172\1\164\1\160\1\151\1\164\1\162\1\144\1\154\1\141\1\160\1\156\1\147\2\uffff\1\151\1\uffff\1\151\1\145\1\172\1\151\1\172\1\145\1\151\1\142\1\162\1\147\1\141\2\172\1\uffff\1\162\3\172\1\uffff\1\171\1\172\2\uffff\1\145\1\uffff\1\172\2\uffff\1\163\1\uffff\1\172\4\uffff\1\165\1\156\2\145\1\uffff\1\165\3\172\2\uffff\1\156\1\172\1\165\1\163\1\156\1\145\1\143\2\uffff\1\156\1\145\4\172\1\uffff\1\165\1\145\1\164\1\172\1\165\2\172\1\156\1\157\1\141\1\150\1\157\1\164\1\143\1\144\1\uffff\1\141\1\uffff\1\172\1\164\1\154\1\171\1\145\1\154\2\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\162\1\164\1\156\1\143\1\164\3\uffff\1\145\1\uffff\1\162\1\172\1\145\1\172\1\164\1\143\1\162\4\uffff\1\162\1\172\1\171\1\uffff\1\155\2\uffff\1\143\1\162\1\154\1\172\1\156\1\145\2\172\1\154\1\uffff\1\171\1\145\3\172\4\uffff\1\141\1\172\2\164\1\145\1\143\1\145\1\uffff\1\144\1\uffff\2\145\1\172\1\145\1\uffff\2\172\1\145\1\164\1\172\1\uffff\2\172\2\uffff\3\172\3\uffff\1\164\1\uffff\1\172\1\165\1\172\1\164\1\154\2\172\1\144\1\172\1\uffff\1\172\2\uffff\2\172\6\uffff\1\151\1\uffff\1\162\1\uffff\2\172\2\uffff\1\172\4\uffff\1\157\1\145\3\uffff\1\156\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\34\uffff\1\167\1\170\1\171\1\173\1\174\1\uffff\1\176\1\u0081\1\u0085\1\u0086\1\u0087\7\uffff\1\u008a\1\u008b\1\u008c\1\uffff\1\u0090\14\uffff\1\u0089\103\uffff\1\150\1\172\1\151\1\177\1\152\1\u0080\1\153\1\154\1\u0082\1\155\1\156\1\u0083\1\157\1\u0084\1\u008f\1\175\1\u0088\73\uffff\1\u008d\56\uffff\1\166\15\uffff\1\161\1\uffff\1\160\1\162\35\uffff\1\163\1\164\1\165\10\uffff\1\u008e\14\uffff\1\124\1\123\1\125\12\uffff\1\146\6\uffff\1\137\1\uffff\1\140\1\141\7\uffff\1\142\1\143\1\144\1\145\10\uffff\1\130\17\uffff\1\126\5\uffff\1\127\6\uffff\1\134\1\135\1\uffff\1\133\3\uffff\1\136\5\uffff\1\147\1\131\1\132\3\uffff\1\102\14\uffff\1\113\1\uffff\1\114\25\uffff\1\115\1\116\1\uffff\1\105\15\uffff\1\106\4\uffff\1\101\2\uffff\1\103\1\104\1\uffff\1\107\1\uffff\1\110\1\111\1\uffff\1\112\1\uffff\1\120\1\117\1\121\1\122\4\uffff\1\63\4\uffff\1\61\1\62\7\uffff\1\76\1\77\6\uffff\1\75\17\uffff\1\70\1\uffff\1\71\6\uffff\1\73\1\72\1\uffff\1\64\1\65\1\66\1\uffff\1\67\1\uffff\1\74\1\uffff\1\100\5\uffff\1\41\1\42\1\43\1\uffff\1\45\7\uffff\1\52\1\53\1\54\1\55\3\uffff\1\56\1\uffff\1\57\1\60\11\uffff\1\47\5\uffff\1\44\1\46\1\50\1\51\7\uffff\1\36\1\uffff\1\35\4\uffff\1\37\5\uffff\1\40\2\uffff\1\30\1\31\3\uffff\1\32\1\33\1\34\1\uffff\1\16\11\uffff\1\23\1\uffff\1\24\1\25\2\uffff\1\26\1\17\1\20\1\21\1\22\1\27\1\uffff\1\7\1\uffff\1\6\2\uffff\1\11\1\10\1\uffff\1\12\1\13\1\14\1\15\2\uffff\1\3\1\4\1\5\3\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\u02a7\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\uffff\1\60\3\uffff\1\34\1\61\1\35\1\36\1\26\1\37\1\40\1\41\1\42\1\27\12\47\1\30\1\43\1\31\1\32\1\33\2\uffff\1\2\1\17\1\1\1\3\1\20\1\11\1\12\1\56\1\13\2\56\1\16\1\25\1\21\1\22\1\4\1\14\1\6\1\7\1\10\1\5\1\15\1\23\1\24\2\56\1\44\1\57\1\45\1\56\2\uffff\1\2\1\50\1\1\1\55\1\20\1\11\1\12\1\56\1\13\2\56\1\16\1\25\1\21\1\51\1\4\1\14\1\6\1\54\1\10\1\53\1\15\1\23\1\52\2\56\1\uffff\1\46",
            "\1\64\15\uffff\1\63\21\uffff\1\64\15\uffff\1\63",
            "\1\73\1\67\2\uffff\1\71\5\uffff\1\72\1\uffff\1\74\3\uffff\1\65\1\70\1\66\15\uffff\1\73\1\67\2\uffff\1\71\5\uffff\1\72\1\uffff\1\74\3\uffff\1\65\1\70\1\66",
            "\1\77\46\uffff\1\75\5\uffff\1\76\31\uffff\1\75\5\uffff\1\76",
            "\1\102\15\uffff\1\101\2\uffff\1\100\2\uffff\1\103\13\uffff\1\102\15\uffff\1\101\2\uffff\1\100\2\uffff\1\103",
            "\1\106\13\uffff\1\104\1\107\3\uffff\1\105\4\uffff\1\110\25\uffff\1\104\4\uffff\1\105",
            "\1\112\3\uffff\1\111\11\uffff\1\113\21\uffff\1\112\3\uffff\1\111\11\uffff\1\113",
            "\1\123\2\uffff\1\115\2\uffff\1\117\1\120\2\uffff\1\121\2\uffff\1\124\1\116\1\uffff\1\122\2\uffff\1\114\2\uffff\1\125\14\uffff\1\115\2\uffff\1\117\1\120\2\uffff\1\121\3\uffff\1\116\1\uffff\1\122\2\uffff\1\114",
            "\1\130\2\uffff\1\131\6\uffff\1\126\2\uffff\1\127\6\uffff\1\132\13\uffff\1\130\2\uffff\1\131\6\uffff\1\126\2\uffff\1\127\6\uffff\1\132",
            "\1\134\5\uffff\1\135\5\uffff\1\133\23\uffff\1\134\5\uffff\1\135\5\uffff\1\133",
            "\1\136\14\uffff\1\140\2\uffff\1\137\17\uffff\1\136\14\uffff\1\140\2\uffff\1\137",
            "\1\143\6\uffff\1\142\1\141\4\uffff\1\144\22\uffff\1\143\6\uffff\1\142\1\141\4\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\150\7\uffff\1\147\5\uffff\1\151\21\uffff\1\150\7\uffff\1\147\5\uffff\1\151",
            "\1\77\42\uffff\1\153\6\uffff\1\154\2\uffff\1\156\2\uffff\1\155\2\uffff\1\152\17\uffff\1\153\6\uffff\1\154\2\uffff\1\156\2\uffff\1\155\2\uffff\1\152",
            "\1\160\1\uffff\1\157\11\uffff\1\161\23\uffff\1\160\1\uffff\1\157\11\uffff\1\161",
            "\1\162\3\uffff\1\164\11\uffff\1\163\5\uffff\1\165\13\uffff\1\162\3\uffff\1\164\11\uffff\1\163\5\uffff\1\165",
            "\1\77\43\uffff\1\171\7\uffff\1\172\1\uffff\1\167\1\uffff\1\173\1\uffff\1\166\1\170\20\uffff\1\171\7\uffff\1\172\1\uffff\1\167\1\uffff\1\173\1\uffff\1\166\1\170",
            "\1\175\6\uffff\1\174\1\176\27\uffff\1\175\6\uffff\1\174\1\176",
            "\1\77\53\uffff\1\177\1\u0080\36\uffff\1\177\1\u0080",
            "\1\u0081\15\uffff\1\u0082\21\uffff\1\u0081\15\uffff\1\u0082",
            "\1\u0083",
            "\1\u0085",
            "\1\u0087",
            "\1\u0089\1\u008a",
            "\1\u008c\1\u008d",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "\12\u0094\10\uffff\1\77\1\uffff\1\77\12\uffff\1\77\3\uffff\1\77\1\uffff\1\77\2\uffff\1\77\6\uffff\1\u0094\2\uffff\1\77\1\uffff\1\77\12\uffff\1\77\3\uffff\1\77\1\uffff\1\77\2\uffff\1\77",
            "\1\77\42\uffff\1\153\6\uffff\1\154\2\uffff\1\156\2\uffff\1\155\2\uffff\1\152\17\uffff\1\153\6\uffff\1\154\2\uffff\1\156\2\uffff\1\155\2\uffff\1\152",
            "\1\77\43\uffff\1\171\7\uffff\1\172\1\uffff\1\167\1\uffff\1\173\1\uffff\1\166\1\170\20\uffff\1\171\7\uffff\1\172\1\uffff\1\167\1\uffff\1\173\1\uffff\1\166\1\170",
            "\1\77\53\uffff\1\177\1\u0080\36\uffff\1\177\1\u0080",
            "\1\104\4\uffff\1\105\16\uffff\1\u0095\13\uffff\1\104\1\u0096\3\uffff\1\105\4\uffff\1\u0097",
            "\1\115\2\uffff\1\117\1\120\2\uffff\1\121\3\uffff\1\116\1\uffff\1\122\2\uffff\1\114\14\uffff\1\u0098\2\uffff\1\115\2\uffff\1\117\1\120\2\uffff\1\121\2\uffff\1\u0099\1\116\1\uffff\1\122\2\uffff\1\114\2\uffff\1\u009a",
            "\1\77\46\uffff\1\75\5\uffff\1\76\31\uffff\1\75\5\uffff\1\76",
            "",
            "",
            "",
            "\41\u00cf\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\uffff\4\u00cf\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\4\u00cf\41\uffff\4\u00cf\1\uffff\1\u00cf\1\uffff\1\u00cf\1\uffff\4\u00cf\1\uffff\6\u00cf\1\uffff\3\u00cf\1\uffff\3\u00cf\3\uffff\101\u00cf\122\uffff\2\u00cf\14\uffff\2\u00cf\26\uffff\1\u00cf\4\uffff\2\u00cf\u1f2d\uffff\1\u00cf",
            "",
            "\1\u00d1\1\u00d0\36\uffff\1\u00d1\1\u00d0",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\16\uffff\1\u00d4\20\uffff\1\u00d3\16\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\16\uffff\1\u00d7\20\uffff\1\u00d6\16\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\2\uffff\1\u00db\34\uffff\1\u00da\2\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e2\1\u00e1\36\uffff\1\u00e2\1\u00e1",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\7\uffff\1\u00e6\12\uffff\1\u00e7\14\uffff\1\u00e5\7\uffff\1\u00e6\12\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\77",
            "\1\77",
            "\1\77",
            "\1\u00eb\2\uffff\1\u00e9\1\u00ea\2\uffff\1\u00ec\2\uffff\1\u00ef\2\uffff\1\u00ed\3\uffff\1\u00ee\16\uffff\1\u00eb\2\uffff\1\u00e9\1\u00ea\2\uffff\1\u00ec\2\uffff\1\u00ef\2\uffff\1\u00ed\3\uffff\1\u00ee",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\5\uffff\1\u00f2\31\uffff\1\u00f1\5\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f5\11\uffff\1\u00f4\25\uffff\1\u00f5\11\uffff\1\u00f4",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\12\uffff\1\u00fa\24\uffff\1\u00f9\12\uffff\1\u00fa",
            "\1\u00fb\12\uffff\1\u00fc\24\uffff\1\u00fb\12\uffff\1\u00fc",
            "\1\77",
            "\1\77",
            "\1\77",
            "\12\56\7\uffff\13\56\1\u00fd\16\56\4\uffff\1\56\1\uffff\13\56\1\u00fd\16\56",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0102\14\uffff\1\u0101\22\uffff\1\u0102\14\uffff\1\u0101",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\12\56\7\uffff\4\56\1\u010a\11\56\1\u010b\13\56\4\uffff\1\56\1\uffff\4\56\1\u010a\11\56\1\u010b\13\56",
            "\1\u010d\37\uffff\1\u010d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\12\uffff\1\u0115\1\u0113\5\uffff\1\u0114\15\uffff\1\u0112\12\uffff\1\u0115\1\u0113\5\uffff\1\u0114",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\14\uffff\1\u0119\22\uffff\1\u0118\14\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011f\17\uffff\1\u011e\17\uffff\1\u011f\17\uffff\1\u011e",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0123\5\uffff\1\u0122\31\uffff\1\u0123\5\uffff\1\u0122",
            "\1\u0124\10\uffff\1\u0125\1\uffff\1\u0126\24\uffff\1\u0124\10\uffff\1\u0125\1\uffff\1\u0126",
            "\1\u0128\1\u0127\36\uffff\1\u0128\1\u0127",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0131\3\uffff\1\u0130\33\uffff\1\u0131\3\uffff\1\u0130",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0094\10\uffff\1\77\1\uffff\1\77\12\uffff\1\77\3\uffff\1\77\1\uffff\1\77\2\uffff\1\77\6\uffff\1\u0094\2\uffff\1\77\1\uffff\1\77\12\uffff\1\77\3\uffff\1\77\1\uffff\1\77\2\uffff\1\77",
            "\1\77",
            "\1\77",
            "\1\77",
            "\1\77",
            "\1\77",
            "\1\77",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00cf",
            "",
            "\1\u0139\14\uffff\1\u013a\22\uffff\1\u0139\14\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u015a\37\uffff\1\u015a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u015d\5\uffff\1\u015e\31\uffff\1\u015d\5\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0168\37\uffff\1\u0168",
            "",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016a\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "",
            "\1\u0176\37\uffff\1\u0176",
            "",
            "",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0181\37\uffff\1\u0181",
            "\1\u0182\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u0183",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0188\3\uffff\1\u0187\33\uffff\1\u0188\3\uffff\1\u0187",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018a\37\uffff\1\u018a",
            "\1\u018b\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u018f\37\uffff\1\u018f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0193\37\uffff\1\u0193",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0196\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "\1\u0198\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "\1\u01a8\37\uffff\1\u01a8",
            "",
            "",
            "",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "\1\u01ab\37\uffff\1\u01ab",
            "\1\u01ac\37\uffff\1\u01ac",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01ae\37\uffff\1\u01ae",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01b0\37\uffff\1\u01b0",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b2\37\uffff\1\u01b2",
            "",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\u01b6\37\uffff\1\u01b6",
            "\1\u01b7\37\uffff\1\u01b7",
            "\1\u01b8\37\uffff\1\u01b8",
            "",
            "\1\u01b9\37\uffff\1\u01b9",
            "",
            "",
            "\1\u01ba\37\uffff\1\u01ba",
            "\1\u01bb\37\uffff\1\u01bb",
            "\1\u01bc\37\uffff\1\u01bc",
            "\1\u01bd\37\uffff\1\u01bd",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\1\u01c0\37\uffff\1\u01c0",
            "",
            "",
            "",
            "",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "\1\u01c4\37\uffff\1\u01c4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01c7\37\uffff\1\u01c7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "\1\u01d1\37\uffff\1\u01d1",
            "\1\u01d2\37\uffff\1\u01d2",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "\1\u01d5\37\uffff\1\u01d5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01d7\37\uffff\1\u01d7",
            "",
            "\1\u01d8\37\uffff\1\u01d8",
            "\1\u01d9\37\uffff\1\u01d9",
            "\1\u01da\37\uffff\1\u01da",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01dc\37\uffff\1\u01dc",
            "",
            "\1\u01dd\37\uffff\1\u01dd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01e0\37\uffff\1\u01e0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01e2\37\uffff\1\u01e2",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01e5\37\uffff\1\u01e5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01e7\37\uffff\1\u01e7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\u01ec\37\uffff\1\u01ec",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\u01ee\37\uffff\1\u01ee",
            "",
            "\1\u01ef\37\uffff\1\u01ef",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01f1\37\uffff\1\u01f1",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "\1\u01f4\37\uffff\1\u01f4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01f7\37\uffff\1\u01f7",
            "\1\u01f8\37\uffff\1\u01f8",
            "\1\u01f9\16\uffff\1\u01fa\20\uffff\1\u01f9\16\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "",
            "\1\u01fc\37\uffff\1\u01fc",
            "",
            "\1\u01fd\37\uffff\1\u01fd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0200\37\uffff\1\u0200",
            "\1\u0201\37\uffff\1\u0201",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "\1\u0204\37\uffff\1\u0204",
            "\1\u0205\37\uffff\1\u0205",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0207\37\uffff\1\u0207",
            "\1\u0208\37\uffff\1\u0208",
            "\1\u0209\37\uffff\1\u0209",
            "\1\u020a\37\uffff\1\u020a",
            "\1\u020b\37\uffff\1\u020b",
            "\1\u020c\37\uffff\1\u020c",
            "\1\u020d\37\uffff\1\u020d",
            "\1\u020e\37\uffff\1\u020e",
            "\1\u020f\37\uffff\1\u020f",
            "\1\u0210\37\uffff\1\u0210",
            "\1\u0211\37\uffff\1\u0211",
            "",
            "",
            "\1\u0212\37\uffff\1\u0212",
            "",
            "\1\u0213\7\uffff\1\u0214\27\uffff\1\u0213\7\uffff\1\u0214",
            "\1\u0215\37\uffff\1\u0215",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0217\37\uffff\1\u0217",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0219\37\uffff\1\u0219",
            "\1\u021a\37\uffff\1\u021a",
            "\1\u021b\37\uffff\1\u021b",
            "\1\u021c\37\uffff\1\u021c",
            "\1\u021d\37\uffff\1\u021d",
            "\1\u021e\37\uffff\1\u021e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0221\37\uffff\1\u0221",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0225\37\uffff\1\u0225",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0227\37\uffff\1\u0227",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0229\37\uffff\1\u0229",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\u022b\37\uffff\1\u022b",
            "\1\u022c\37\uffff\1\u022c",
            "\1\u022d\37\uffff\1\u022d",
            "\1\u022e\37\uffff\1\u022e",
            "",
            "\1\u022f\37\uffff\1\u022f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0233\37\uffff\1\u0233",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0235\37\uffff\1\u0235",
            "\1\u0236\37\uffff\1\u0236",
            "\1\u0237\37\uffff\1\u0237",
            "\1\u0238\37\uffff\1\u0238",
            "\1\u0239\37\uffff\1\u0239",
            "",
            "",
            "\1\u023a\37\uffff\1\u023a",
            "\1\u023b\37\uffff\1\u023b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0240\37\uffff\1\u0240",
            "\1\u0241\37\uffff\1\u0241",
            "\1\u0242\37\uffff\1\u0242",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0244\37\uffff\1\u0244",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0247\37\uffff\1\u0247",
            "\1\u0248\37\uffff\1\u0248",
            "\1\u0249\37\uffff\1\u0249",
            "\1\u024a\37\uffff\1\u024a",
            "\1\u024b\37\uffff\1\u024b",
            "\1\u024c\37\uffff\1\u024c",
            "\1\u024d\37\uffff\1\u024d",
            "\1\u024e\37\uffff\1\u024e",
            "",
            "\1\u024f\37\uffff\1\u024f",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0251\37\uffff\1\u0251",
            "\1\u0252\37\uffff\1\u0252",
            "\1\u0253\37\uffff\1\u0253",
            "\1\u0254\37\uffff\1\u0254",
            "\1\u0255\37\uffff\1\u0255",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u025a\37\uffff\1\u025a",
            "\1\u025b\37\uffff\1\u025b",
            "\1\u025c\37\uffff\1\u025c",
            "\1\u025d\37\uffff\1\u025d",
            "\1\u025e\37\uffff\1\u025e",
            "",
            "",
            "",
            "\1\u025f\37\uffff\1\u025f",
            "",
            "\1\u0260\37\uffff\1\u0260",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0262\37\uffff\1\u0262",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0264\37\uffff\1\u0264",
            "\1\u0265\37\uffff\1\u0265",
            "\1\u0266\37\uffff\1\u0266",
            "",
            "",
            "",
            "",
            "\1\u0267\37\uffff\1\u0267",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0269\37\uffff\1\u0269",
            "",
            "\1\u026a\37\uffff\1\u026a",
            "",
            "",
            "\1\u026b\37\uffff\1\u026b",
            "\1\u026c\37\uffff\1\u026c",
            "\1\u026d\37\uffff\1\u026d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u026f\37\uffff\1\u026f",
            "\1\u0270\37\uffff\1\u0270",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0273\37\uffff\1\u0273",
            "",
            "\1\u0274\37\uffff\1\u0274",
            "\1\u0275\37\uffff\1\u0275",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\u0279\37\uffff\1\u0279",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u027b\37\uffff\1\u027b",
            "\1\u027c\37\uffff\1\u027c",
            "\1\u027d\37\uffff\1\u027d",
            "\1\u027e\37\uffff\1\u027e",
            "\1\u027f\3\uffff\1\u0280\33\uffff\1\u027f\3\uffff\1\u0280",
            "",
            "\1\u0281\37\uffff\1\u0281",
            "",
            "\1\u0282\37\uffff\1\u0282",
            "\1\u0283\37\uffff\1\u0283",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0285\37\uffff\1\u0285",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0288\37\uffff\1\u0288",
            "\1\u0289\37\uffff\1\u0289",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\u0290\37\uffff\1\u0290",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0292\37\uffff\1\u0292",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0294\37\uffff\1\u0294",
            "\1\u0295\37\uffff\1\u0295",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0298\37\uffff\1\u0298",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u029d\37\uffff\1\u029d",
            "",
            "\1\u029e\37\uffff\1\u029e",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\u02a2\37\uffff\1\u02a2",
            "\1\u02a3\37\uffff\1\u02a3",
            "",
            "",
            "",
            "\1\u02a4\37\uffff\1\u02a4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Configuration | Architecture | Disconnect | Procedural | Unaffected | Attribute | Component | Postponed | Procedure | Reference | Subnature | Tolerance | Transport | Constant | Function | Generate | Inertial | Quantity | Register | Severity | Spectrum | Terminal | Variable | Generic | Guarded | Library | Linkage | Literal | Package | Process | Subtype | Through | Access | Across | Assert | Buffer | Downto | Entity | Impure | Nature | Others | Record | Reject | Report | Return | Select | Shared | Signal | After | Alias | Array | Begin | Block | Break | Elsif | Group | Inout | Label | Limit | Noise | Range | Units | Until | While | Body | Case | Else | Exit | File | Loop | Nand | Next | Null | Open | Port | Pure | Then | Type | Wait | When | With | Xnor | Abs | All | And | Bus | End | For | Map | Mod | New | Nor | Not | Out | Rem | Rol | Ror | Sla | Sll | Sra | Srl | Use | Xor | AsteriskAsterisk | SolidusEqualsSign | ColonEqualsSign | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | If | In | Is | Of | On | Or | To | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | VerticalLine | RULE_ABSTRACT_LITERAL | RULE_BIT_STRING_LITERAL | RULE_ID | RULE_EXTENDED_IDENTIFIER | RULE_STRING | RULE_CHAR | RULE_ATTRIBUTE | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}