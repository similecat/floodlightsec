package apron.permissionlanguage;
// Generated from Apron.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApronParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, PERM=8, LIMITING=9, 
		ACTION=10, OWN_FLOWS=11, OTHERS_FLOWS=12, ALL_FLOWS=13, MAX_PRIORITY=14, 
		EVENT_INTERCEPTION=15, MODIFY_EVENT_ORDER=16, FLOW_LEVEL=17, PORT_LEVEL=18, 
		SWITCH_LEVEL=19, IP_SRC=20, IP_DST=21, TCP_SRC=22, TCP_DST=23, VLAN_ID=24, 
		INT=25, FLOAT=26, IP=27, WITH=28, MASK=29, IP_FORMAT=30, SWITCH=31, LINK=32, 
		ALL_SWITCHES=33, BORDER_SWITCHES=34, ALL_DIRECT_LINKS=35, ALL_PATHS_AS_LINKS=36, 
		VIRTUAL=37, SINGLE_BIG_SWITCH=38, DROP=39, FORWARD=40, MODIFY=41, FIELD=42, 
		AND=43, OR=44, NOT=45, AS=46, RULE_COUNT_PER_SWITCH=47, SIZE_PERCENTAGE_PER_SWITCH=48, 
		FROM_PKT_IN=49, ARBITRARY=50, AllowNetworkAccess=51, DenyNetworkAccess=52, 
		AllowFileSystem=53, DenyFileSystem=54, AllowProcessRuntime=55, DenyProcessRuntime=56, 
		STRING=57, WS=58;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'-'", "'('", "':'", "'}'", "'PERM'", 
		"'LIMITING'", "'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", "'ALL_FLOWS'", 
		"'MAX_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", "'FLOW_LEVEL'", 
		"'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", "'TCP_SRC'", 
		"'TCP_DST'", "'VLAN_ID'", "INT", "FLOAT", "'IP'", "'WITH'", "'MASK'", 
		"IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", "'BORDER_SWITCHES'", 
		"'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", "'SINGLE_BIG_SWITCH'", 
		"'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", "'OR'", "'NOT'", 
		"'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", "'FROM_PKT_IN'", 
		"'ARBITRARY'", "'AllowNetworkAccess'", "'DenyNetworkAccess'", "'AllowFileSystem'", 
		"'DenyFileSystem'", "'AllowProcessRuntime'", "'DenyProcessRuntime'", "STRING", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_perm_list = 1, RULE_perm = 2, RULE_filter_expr = 3, 
		RULE_filter_term = 4, RULE_filter_factor = 5, RULE_filter_not_factor = 6, 
		RULE_flow_predicate = 7, RULE_field = 8, RULE_value_list = 9, RULE_value_range = 10, 
		RULE_ip_range = 11, RULE_ip_format = 12, RULE_topo = 13, RULE_physical_topo = 14, 
		RULE_switch_set = 15, RULE_sw_idx_list = 16, RULE_sw_idx = 17, RULE_link_set = 18, 
		RULE_link_list = 19, RULE_link = 20, RULE_path = 21, RULE_link_idx = 22, 
		RULE_virtual_topo = 23, RULE_switch_mapping = 24, RULE_virtual_switch_set = 25, 
		RULE_action = 26, RULE_field_list = 27, RULE_ownership = 28, RULE_max_priority = 29, 
		RULE_flow_table = 30, RULE_notification = 31, RULE_statistics = 32, RULE_pkt_out = 33, 
		RULE_perm_name = 34, RULE_system = 35;
	public static final String[] ruleNames = {
		"program", "perm_list", "perm", "filter_expr", "filter_term", "filter_factor", 
		"filter_not_factor", "flow_predicate", "field", "value_list", "value_range", 
		"ip_range", "ip_format", "topo", "physical_topo", "switch_set", "sw_idx_list", 
		"sw_idx", "link_set", "link_list", "link", "path", "link_idx", "virtual_topo", 
		"switch_mapping", "virtual_switch_set", "action", "field_list", "ownership", 
		"max_priority", "flow_table", "notification", "statistics", "pkt_out", 
		"perm_name", "system"
	};

	@Override
	public String getGrammarFileName() { return "Apron.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ApronParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinalContext extends ProgramContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public FinalContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new FinalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72); perm_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perm_listContext extends ParserRuleContext {
		public Perm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_list; }
	 
		public Perm_listContext() { }
		public void copyFrom(Perm_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PermListSContext extends Perm_listContext {
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListSContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermListMContext extends Perm_listContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListMContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_listContext perm_list() throws RecognitionException {
		Perm_listContext _localctx = new Perm_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_perm_list);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PermListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74); perm();
				}
				break;

			case 2:
				_localctx = new PermListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); perm();
				setState(76); perm_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PermContext extends ParserRuleContext {
		public PermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm; }
	 
		public PermContext() { }
		public void copyFrom(PermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PermSContext extends PermContext {
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ApronParser.PERM, 0); }
		public PermSContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermMContext extends PermContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public TerminalNode LIMITING() { return getToken(ApronParser.LIMITING, 0); }
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ApronParser.PERM, 0); }
		public PermMContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermContext perm() throws RecognitionException {
		PermContext _localctx = new PermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perm);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PermSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); match(PERM);
				setState(81); perm_name();
				}
				break;

			case 2:
				_localctx = new PermMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(PERM);
				setState(83); perm_name();
				setState(84); match(LIMITING);
				setState(85); filter_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_exprContext extends ParserRuleContext {
		public int _p;
		public Filter_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_expr; }
	 
		public Filter_exprContext() { }
		public void copyFrom(Filter_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FilterExprAndTermContext extends Filter_exprContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public FilterExprAndTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExprAndTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExprAndTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExprAndTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprTermContext extends Filter_exprContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public FilterExprTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_exprContext filter_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_exprContext _localctx = new Filter_exprContext(_ctx, _parentState, _p);
		Filter_exprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_filter_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FilterExprTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(90); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterExprAndTermContext(new Filter_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_expr);
					setState(92);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(93); match(AND);
					setState(94); filter_term(0);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Filter_termContext extends ParserRuleContext {
		public int _p;
		public Filter_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_termContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_term; }
	 
		public Filter_termContext() { }
		public void copyFrom(Filter_termContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FilterTermFactorContext extends Filter_termContext {
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterTermFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterTermOrFactorContext extends Filter_termContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public TerminalNode OR() { return getToken(ApronParser.OR, 0); }
		public FilterTermOrFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterTermOrFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterTermOrFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterTermOrFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_termContext filter_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_termContext _localctx = new Filter_termContext(_ctx, _parentState, _p);
		Filter_termContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_filter_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FilterTermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(101); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterTermOrFactorContext(new Filter_termContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_term);
					setState(103);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(104); match(OR);
					setState(105); filter_factor();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Filter_factorContext extends ParserRuleContext {
		public Filter_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_factor; }
	 
		public Filter_factorContext() { }
		public void copyFrom(Filter_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterFactorNotFactorContext extends Filter_factorContext {
		public Filter_not_factorContext filter_not_factor() {
			return getRuleContext(Filter_not_factorContext.class,0);
		}
		public FilterFactorNotFactorContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterFactorNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterFactorNotFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterFactorNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterFactorNotContext extends Filter_factorContext {
		public TerminalNode NOT() { return getToken(ApronParser.NOT, 0); }
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterFactorNotContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterFactorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterFactorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterFactorNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_factorContext filter_factor() throws RecognitionException {
		Filter_factorContext _localctx = new Filter_factorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filter_factor);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case 5:
			case ACTION:
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
			case MAX_PRIORITY:
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
			case SWITCH:
			case VIRTUAL:
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
			case FROM_PKT_IN:
			case ARBITRARY:
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new FilterFactorNotFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new FilterFactorNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(NOT);
				setState(113); filter_factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_not_factorContext extends ParserRuleContext {
		public Filter_not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_not_factor; }
	 
		public Filter_not_factorContext() { }
		public void copyFrom(Filter_not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OwnershipSContext extends Filter_not_factorContext {
		public OwnershipContext ownership() {
			return getRuleContext(OwnershipContext.class,0);
		}
		public OwnershipSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOwnershipS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOwnershipS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOwnershipS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableContext extends Filter_not_factorContext {
		public Flow_tableContext flow_table() {
			return getRuleContext(Flow_tableContext.class,0);
		}
		public FlowTableContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprContext extends Filter_not_factorContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public FilterExprContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowPredicateContext extends Filter_not_factorContext {
		public Flow_predicateContext flow_predicate() {
			return getRuleContext(Flow_predicateContext.class,0);
		}
		public FlowPredicateContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopologyContext extends Filter_not_factorContext {
		public TopoContext topo() {
			return getRuleContext(TopoContext.class,0);
		}
		public TopologyContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterTopology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitTopology(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitTopology(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionsContext extends Filter_not_factorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ApronParser.ACTION, 0); }
		public ActionsContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutContext extends Filter_not_factorContext {
		public Pkt_outContext pkt_out() {
			return getRuleContext(Pkt_outContext.class,0);
		}
		public PktOutContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemSContext extends Filter_not_factorContext {
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public SystemSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSystemS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSystemS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSystemS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxPriorityContext extends Filter_not_factorContext {
		public Max_priorityContext max_priority() {
			return getRuleContext(Max_priorityContext.class,0);
		}
		public MaxPriorityContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterMaxPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitMaxPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitMaxPriority(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotificationSContext extends Filter_not_factorContext {
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public NotificationSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNotificationS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNotificationS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNotificationS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatisticsSContext extends Filter_not_factorContext {
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public StatisticsSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterStatisticsS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitStatisticsS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitStatisticsS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_not_factorContext filter_not_factor() throws RecognitionException {
		Filter_not_factorContext _localctx = new Filter_not_factorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter_not_factor);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case 5:
				_localctx = new FilterExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(5);
				setState(117); filter_expr(0);
				setState(118); match(2);
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
				_localctx = new FlowPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new TopologyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121); topo();
				}
				break;
			case ACTION:
				_localctx = new ActionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122); match(ACTION);
				setState(123); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new OwnershipSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124); ownership();
				}
				break;
			case MAX_PRIORITY:
				_localctx = new MaxPriorityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new NotificationSContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new StatisticsSContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(128); statistics();
				}
				break;
			case FROM_PKT_IN:
			case ARBITRARY:
				_localctx = new PktOutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(129); pkt_out();
				}
				break;
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new SystemSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(130); system();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_predicateContext extends ParserRuleContext {
		public Flow_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_predicate; }
	 
		public Flow_predicateContext() { }
		public void copyFrom(Flow_predicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldListContext extends Flow_predicateContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public FieldListContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IpRangeContext extends Flow_predicateContext {
		public Ip_rangeContext ip_range() {
			return getRuleContext(Ip_rangeContext.class,0);
		}
		public IpRangeContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterIpRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitIpRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitIpRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flow_predicate);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new IpRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133); ip_range();
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
				_localctx = new FieldListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134); field();
				setState(135); match(1);
				setState(136); value_list();
				setState(137); match(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IP_SRC() { return getToken(ApronParser.IP_SRC, 0); }
		public TerminalNode TCP_DST() { return getToken(ApronParser.TCP_DST, 0); }
		public TerminalNode VLAN_ID() { return getToken(ApronParser.VLAN_ID, 0); }
		public TerminalNode TCP_SRC() { return getToken(ApronParser.TCP_SRC, 0); }
		public TerminalNode IP_DST() { return getToken(ApronParser.IP_DST, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IP_SRC) | (1L << IP_DST) | (1L << TCP_SRC) | (1L << TCP_DST) | (1L << VLAN_ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	 
		public Value_listContext() { }
		public void copyFrom(Value_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueListMContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ValueListMContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValueListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValueListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValueListM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueListSContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public ValueListSContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValueListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValueListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValueListS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value_list);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ValueListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143); value_range();
				}
				break;

			case 2:
				_localctx = new ValueListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144); value_range();
				setState(145); match(3);
				setState(146); value_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_rangeContext extends ParserRuleContext {
		public Value_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_range; }
	 
		public Value_rangeContext() { }
		public void copyFrom(Value_rangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueRangeSContext extends Value_rangeContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public ValueRangeSContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValueRangeS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValueRangeS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValueRangeS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueRangeMContext extends Value_rangeContext {
		public List<TerminalNode> INT() { return getTokens(ApronParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ApronParser.INT, i);
		}
		public ValueRangeMContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValueRangeM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValueRangeM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValueRangeM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rangeContext value_range() throws RecognitionException {
		Value_rangeContext _localctx = new Value_rangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value_range);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ValueRangeSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(INT);
				}
				break;

			case 2:
				_localctx = new ValueRangeMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(INT);
				setState(152); match(4);
				setState(153); match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_rangeContext extends ParserRuleContext {
		public TerminalNode MASK() { return getToken(ApronParser.MASK, 0); }
		public Ip_formatContext ip_format(int i) {
			return getRuleContext(Ip_formatContext.class,i);
		}
		public List<Ip_formatContext> ip_format() {
			return getRuleContexts(Ip_formatContext.class);
		}
		public TerminalNode IP() { return getToken(ApronParser.IP, 0); }
		public TerminalNode WITH() { return getToken(ApronParser.WITH, 0); }
		public Ip_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterIp_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitIp_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitIp_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_rangeContext ip_range() throws RecognitionException {
		Ip_rangeContext _localctx = new Ip_rangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ip_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(IP);
			setState(157); ip_format();
			setState(158); match(WITH);
			setState(159); match(MASK);
			setState(160); ip_format();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_formatContext extends ParserRuleContext {
		public TerminalNode IP_FORMAT() { return getToken(ApronParser.IP_FORMAT, 0); }
		public Ip_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterIp_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitIp_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitIp_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_formatContext ip_format() throws RecognitionException {
		Ip_formatContext _localctx = new Ip_formatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ip_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(IP_FORMAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopoContext extends ParserRuleContext {
		public TopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topo; }
	 
		public TopoContext() { }
		public void copyFrom(TopoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualTopoContext extends TopoContext {
		public Virtual_topoContext virtual_topo() {
			return getRuleContext(Virtual_topoContext.class,0);
		}
		public VirtualTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualTopo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhysicalTopoContext extends TopoContext {
		public Physical_topoContext physical_topo() {
			return getRuleContext(Physical_topoContext.class,0);
		}
		public PhysicalTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPhysicalTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPhysicalTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPhysicalTopo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopoContext topo() throws RecognitionException {
		TopoContext _localctx = new TopoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_topo);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new PhysicalTopoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new VirtualTopoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165); virtual_topo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(ApronParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public TerminalNode SWITCH() { return getToken(ApronParser.SWITCH, 0); }
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Physical_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPhysical_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPhysical_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPhysical_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_topoContext physical_topo() throws RecognitionException {
		Physical_topoContext _localctx = new Physical_topoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(SWITCH);
			setState(169); switch_set();
			setState(170); match(AND);
			setState(171); match(LINK);
			setState(172); link_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_setContext extends ParserRuleContext {
		public Switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_set; }
	 
		public Switch_setContext() { }
		public void copyFrom(Switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllSwitchesContext extends Switch_setContext {
		public TerminalNode ALL_SWITCHES() { return getToken(ApronParser.ALL_SWITCHES, 0); }
		public AllSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllSwitches(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListContext extends Switch_setContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public SwIdxListContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BorderSwitchesContext extends Switch_setContext {
		public TerminalNode BORDER_SWITCHES() { return getToken(ApronParser.BORDER_SWITCHES, 0); }
		public BorderSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterBorderSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitBorderSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitBorderSwitches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_setContext switch_set() throws RecognitionException {
		Switch_setContext _localctx = new Switch_setContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_set);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new AllSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new BorderSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175); match(BORDER_SWITCHES);
				}
				break;
			case 1:
				_localctx = new SwIdxListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(1);
				setState(177); sw_idx_list();
				setState(178); match(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sw_idx_listContext extends ParserRuleContext {
		public Sw_idx_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx_list; }
	 
		public Sw_idx_listContext() { }
		public void copyFrom(Sw_idx_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwIdxListSContext extends Sw_idx_listContext {
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListSContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListMContext extends Sw_idx_listContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListMContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idx_listContext sw_idx_list() throws RecognitionException {
		Sw_idx_listContext _localctx = new Sw_idx_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sw_idx_list);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SwIdxListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182); sw_idx();
				}
				break;

			case 2:
				_localctx = new SwIdxListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183); sw_idx();
				setState(184); match(3);
				setState(185); sw_idx_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sw_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public Sw_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSw_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSw_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSw_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idxContext sw_idx() throws RecognitionException {
		Sw_idxContext _localctx = new Sw_idxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_setContext extends ParserRuleContext {
		public Link_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_set; }
	 
		public Link_setContext() { }
		public void copyFrom(Link_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllDriectLinksContext extends Link_setContext {
		public TerminalNode ALL_DIRECT_LINKS() { return getToken(ApronParser.ALL_DIRECT_LINKS, 0); }
		public AllDriectLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllDriectLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllDriectLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllDriectLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllPathsAsLinksContext extends Link_setContext {
		public TerminalNode ALL_PATHS_AS_LINKS() { return getToken(ApronParser.ALL_PATHS_AS_LINKS, 0); }
		public AllPathsAsLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllPathsAsLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllPathsAsLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllPathsAsLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListContext extends Link_setContext {
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_setContext link_set() throws RecognitionException {
		Link_setContext _localctx = new Link_setContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_link_set);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new AllDriectLinksContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new AllPathsAsLinksContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 5:
			case INT:
				_localctx = new LinkListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193); link_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_listContext extends ParserRuleContext {
		public Link_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_list; }
	 
		public Link_listContext() { }
		public void copyFrom(Link_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LinkListSContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public LinkListSContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListMContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListMContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_link_list);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LinkListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196); link();
				}
				break;

			case 2:
				_localctx = new LinkListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197); link();
				setState(198); match(3);
				setState(199); link_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	 
		public LinkContext() { }
		public void copyFrom(LinkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LinkMContext extends LinkContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public LinkMContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkSContext extends LinkContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public LinkSContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_link);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new LinkSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203); link_idx();
				}
				break;
			case 5:
				_localctx = new LinkMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(5);
				setState(205); path();
				setState(206); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathMContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathMContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPathM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPathM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPathM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathSContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathSContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPathS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPathS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPathS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PathSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210); link_idx();
				}
				break;

			case 2:
				_localctx = new PathMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211); link_idx();
				setState(212); match(6);
				setState(213); path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public Link_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLink_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLink_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLink_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_idxContext link_idx() throws RecognitionException {
		Link_idxContext _localctx = new Link_idxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Virtual_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(ApronParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public Switch_mappingContext switch_mapping() {
			return getRuleContext(Switch_mappingContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ApronParser.VIRTUAL, 0); }
		public TerminalNode SWITCH() { return getToken(ApronParser.SWITCH, 0); }
		public Virtual_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtual_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtual_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtual_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_topoContext virtual_topo() throws RecognitionException {
		Virtual_topoContext _localctx = new Virtual_topoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(VIRTUAL);
			setState(220); match(SWITCH);
			setState(221); switch_mapping();
			setState(222); match(AND);
			setState(223); match(LINK);
			setState(224); link_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_mappingContext extends ParserRuleContext {
		public Switch_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_mapping; }
	 
		public Switch_mappingContext() { }
		public void copyFrom(Switch_mappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualSwitchSetContext extends Switch_mappingContext {
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public VirtualSwitchSetContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleBigSwitchContext extends Switch_mappingContext {
		public TerminalNode SINGLE_BIG_SWITCH() { return getToken(ApronParser.SINGLE_BIG_SWITCH, 0); }
		public SingleBigSwitchContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSingleBigSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSingleBigSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSingleBigSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_mappingContext switch_mapping() throws RecognitionException {
		Switch_mappingContext _localctx = new Switch_mappingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_mapping);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new SingleBigSwitchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 1:
				_localctx = new VirtualSwitchSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227); match(1);
				setState(228); virtual_switch_set();
				setState(229); match(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Virtual_switch_setContext extends ParserRuleContext {
		public Virtual_switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_switch_set; }
	 
		public Virtual_switch_setContext() { }
		public void copyFrom(Virtual_switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualSwitchSetSContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ApronParser.AS, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetSContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSetS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSetS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSetS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VirtualSwitchSetMContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ApronParser.AS, 0); }
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetMContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSetM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSetM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSetM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_switch_setContext virtual_switch_set() throws RecognitionException {
		Virtual_switch_setContext _localctx = new Virtual_switch_setContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_virtual_switch_set);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VirtualSwitchSetSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); switch_set();
				setState(234); match(AS);
				setState(235); sw_idx();
				}
				break;

			case 2:
				_localctx = new VirtualSwitchSetMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237); switch_set();
				setState(238); match(AS);
				setState(239); sw_idx();
				setState(240); match(3);
				setState(241); virtual_switch_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropContext extends ActionContext {
		public TerminalNode DROP() { return getToken(ApronParser.DROP, 0); }
		public DropContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyFieldContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ApronParser.MODIFY, 0); }
		public TerminalNode FIELD() { return getToken(ApronParser.FIELD, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public ModifyFieldContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModifyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModifyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModifyField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ApronParser.MODIFY, 0); }
		public ModifyContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForwardContext extends ActionContext {
		public TerminalNode FORWARD() { return getToken(ApronParser.FORWARD, 0); }
		public ForwardContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_action);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new DropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245); match(DROP);
				}
				break;

			case 2:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new ModifyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new ModifyFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248); match(MODIFY);
				setState(249); match(FIELD);
				setState(250); field_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_listContext extends ParserRuleContext {
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	 
		public Field_listContext() { }
		public void copyFrom(Field_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FiledSContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FiledSContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFiledS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFiledS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFiledS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldMContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public FieldMContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_field_list);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FiledSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253); field();
				}
				break;

			case 2:
				_localctx = new FieldMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254); field();
				setState(255); match(3);
				setState(256); field_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnershipContext extends ParserRuleContext {
		public OwnershipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownership; }
	 
		public OwnershipContext() { }
		public void copyFrom(OwnershipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllFlowsContext extends OwnershipContext {
		public TerminalNode ALL_FLOWS() { return getToken(ApronParser.ALL_FLOWS, 0); }
		public AllFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnFlowsContext extends OwnershipContext {
		public TerminalNode OWN_FLOWS() { return getToken(ApronParser.OWN_FLOWS, 0); }
		public OwnFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOwnFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOwnFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOwnFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OthersFlowsContext extends OwnershipContext {
		public TerminalNode OTHERS_FLOWS() { return getToken(ApronParser.OTHERS_FLOWS, 0); }
		public OthersFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOthersFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOthersFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOthersFlows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnershipContext ownership() throws RecognitionException {
		OwnershipContext _localctx = new OwnershipContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ownership);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new OwnFlowsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new OthersFlowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new AllFlowsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262); match(ALL_FLOWS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_priorityContext extends ParserRuleContext {
		public TerminalNode MAX_PRIORITY() { return getToken(ApronParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterMax_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitMax_priority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitMax_priority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_max_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(MAX_PRIORITY);
			setState(266); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_tableContext extends ParserRuleContext {
		public Flow_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_table; }
	 
		public Flow_tableContext() { }
		public void copyFrom(Flow_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlowTableBContext extends Flow_tableContext {
		public TerminalNode SIZE_PERCENTAGE_PER_SWITCH() { return getToken(ApronParser.SIZE_PERCENTAGE_PER_SWITCH, 0); }
		public TerminalNode FLOAT() { return getToken(ApronParser.FLOAT, 0); }
		public FlowTableBContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTableB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTableB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTableB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableAContext extends Flow_tableContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public TerminalNode RULE_COUNT_PER_SWITCH() { return getToken(ApronParser.RULE_COUNT_PER_SWITCH, 0); }
		public FlowTableAContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTableA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTableA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTableA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_tableContext flow_table() throws RecognitionException {
		Flow_tableContext _localctx = new Flow_tableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flow_table);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new FlowTableAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(RULE_COUNT_PER_SWITCH);
				setState(269); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(271); match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotificationContext extends ParserRuleContext {
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
	 
		public NotificationContext() { }
		public void copyFrom(NotificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EventInterceptionContext extends NotificationContext {
		public TerminalNode EVENT_INTERCEPTION() { return getToken(ApronParser.EVENT_INTERCEPTION, 0); }
		public EventInterceptionContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterEventInterception(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitEventInterception(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitEventInterception(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyEventOrderContext extends NotificationContext {
		public TerminalNode MODIFY_EVENT_ORDER() { return getToken(ApronParser.MODIFY_EVENT_ORDER, 0); }
		public ModifyEventOrderContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModifyEventOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModifyEventOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModifyEventOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_notification);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new EventInterceptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new ModifyEventOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(MODIFY_EVENT_ORDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticsContext extends ParserRuleContext {
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
	 
		public StatisticsContext() { }
		public void copyFrom(StatisticsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PortLevelContext extends StatisticsContext {
		public TerminalNode PORT_LEVEL() { return getToken(ApronParser.PORT_LEVEL, 0); }
		public PortLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPortLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPortLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPortLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowLevelContext extends StatisticsContext {
		public TerminalNode FLOW_LEVEL() { return getToken(ApronParser.FLOW_LEVEL, 0); }
		public FlowLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchLevelContext extends StatisticsContext {
		public TerminalNode SWITCH_LEVEL() { return getToken(ApronParser.SWITCH_LEVEL, 0); }
		public SwitchLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwitchLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwitchLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwitchLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statistics);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new FlowLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new PortLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new SwitchLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280); match(SWITCH_LEVEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pkt_outContext extends ParserRuleContext {
		public Pkt_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkt_out; }
	 
		public Pkt_outContext() { }
		public void copyFrom(Pkt_outContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PktOutDenyContext extends Pkt_outContext {
		public TerminalNode FROM_PKT_IN() { return getToken(ApronParser.FROM_PKT_IN, 0); }
		public PktOutDenyContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOutDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOutDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOutDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutAllowContext extends Pkt_outContext {
		public TerminalNode ARBITRARY() { return getToken(ApronParser.ARBITRARY, 0); }
		public PktOutAllowContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOutAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOutAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOutAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pkt_outContext pkt_out() throws RecognitionException {
		Pkt_outContext _localctx = new Pkt_outContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pkt_out);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case FROM_PKT_IN:
				_localctx = new PktOutDenyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283); match(FROM_PKT_IN);
				}
				break;
			case ARBITRARY:
				_localctx = new PktOutAllowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284); match(ARBITRARY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perm_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ApronParser.STRING, 0); }
		public Perm_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPerm_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPerm_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPerm_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_nameContext perm_name() throws RecognitionException {
		Perm_nameContext _localctx = new Perm_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemContext extends ParserRuleContext {
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
	 
		public SystemContext() { }
		public void copyFrom(SystemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NetworkDenyContext extends SystemContext {
		public TerminalNode DenyNetworkAccess() { return getToken(ApronParser.DenyNetworkAccess, 0); }
		public NetworkDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNetworkDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNetworkDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNetworkDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileDenyContext extends SystemContext {
		public TerminalNode DenyFileSystem() { return getToken(ApronParser.DenyFileSystem, 0); }
		public FileDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFileDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFileDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFileDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NetworkAllowContext extends SystemContext {
		public TerminalNode AllowNetworkAccess() { return getToken(ApronParser.AllowNetworkAccess, 0); }
		public NetworkAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNetworkAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNetworkAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNetworkAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileAllowContext extends SystemContext {
		public TerminalNode AllowFileSystem() { return getToken(ApronParser.AllowFileSystem, 0); }
		public FileAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFileAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFileAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFileAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessDenyContext extends SystemContext {
		public TerminalNode DenyProcessRuntime() { return getToken(ApronParser.DenyProcessRuntime, 0); }
		public ProcessDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterProcessDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitProcessDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitProcessDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessAllowContext extends SystemContext {
		public TerminalNode AllowProcessRuntime() { return getToken(ApronParser.AllowProcessRuntime, 0); }
		public ProcessAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterProcessAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitProcessAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitProcessAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_system);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case AllowNetworkAccess:
				_localctx = new NetworkAllowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(AllowNetworkAccess);
				}
				break;
			case DenyNetworkAccess:
				_localctx = new NetworkDenyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290); match(DenyNetworkAccess);
				}
				break;
			case AllowFileSystem:
				_localctx = new FileAllowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291); match(AllowFileSystem);
				}
				break;
			case DenyFileSystem:
				_localctx = new FileDenyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292); match(DenyFileSystem);
				}
				break;
			case AllowProcessRuntime:
				_localctx = new ProcessAllowContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(293); match(AllowProcessRuntime);
				}
				break;
			case DenyProcessRuntime:
				_localctx = new ProcessDenyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(294); match(DenyProcessRuntime);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return filter_expr_sempred((Filter_exprContext)_localctx, predIndex);

		case 4: return filter_term_sempred((Filter_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_expr_sempred(Filter_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean filter_term_sempred(Filter_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3<\u012c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3Q\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5b\n\5\f\5\16\5e\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p"+
		"\13\6\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\5\f\u009d"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u00a9\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b7\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u00c5\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00cc\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00da\n\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00ea\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f6"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fe\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0105\n\35\3\36\3\36\3\36\5\36\u010a\n\36\3\37\3\37\3\37\3"+
		" \3 \3 \3 \5 \u0113\n \3!\3!\5!\u0117\n!\3\"\3\"\3\"\5\"\u011c\n\"\3#"+
		"\3#\5#\u0120\n#\3$\3$\3%\3%\3%\3%\3%\3%\5%\u012a\n%\3%\2&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\3\26\32"+
		"\u0134\2J\3\2\2\2\4P\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\nf\3\2\2\2\ft\3\2\2"+
		"\2\16\u0085\3\2\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u0096\3\2\2\2"+
		"\26\u009c\3\2\2\2\30\u009e\3\2\2\2\32\u00a4\3\2\2\2\34\u00a8\3\2\2\2\36"+
		"\u00aa\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c4\3"+
		"\2\2\2(\u00cb\3\2\2\2*\u00d2\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60"+
		"\u00dd\3\2\2\2\62\u00e9\3\2\2\2\64\u00f5\3\2\2\2\66\u00fd\3\2\2\28\u0104"+
		"\3\2\2\2:\u0109\3\2\2\2<\u010b\3\2\2\2>\u0112\3\2\2\2@\u0116\3\2\2\2B"+
		"\u011b\3\2\2\2D\u011f\3\2\2\2F\u0121\3\2\2\2H\u0129\3\2\2\2JK\5\4\3\2"+
		"K\3\3\2\2\2LQ\5\6\4\2MN\5\6\4\2NO\5\4\3\2OQ\3\2\2\2PL\3\2\2\2PM\3\2\2"+
		"\2Q\5\3\2\2\2RS\7\n\2\2SZ\5F$\2TU\7\n\2\2UV\5F$\2VW\7\13\2\2WX\5\b\5\2"+
		"XZ\3\2\2\2YR\3\2\2\2YT\3\2\2\2Z\7\3\2\2\2[\\\b\5\1\2\\]\5\n\6\2]c\3\2"+
		"\2\2^_\6\5\2\3_`\7-\2\2`b\5\n\6\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2d\t\3\2\2\2ec\3\2\2\2fg\b\6\1\2gh\5\f\7\2hn\3\2\2\2ij\6\6\3\3jk\7"+
		".\2\2km\5\f\7\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn"+
		"\3\2\2\2qu\5\16\b\2rs\7/\2\2su\5\f\7\2tq\3\2\2\2tr\3\2\2\2u\r\3\2\2\2"+
		"vw\7\7\2\2wx\5\b\5\2xy\7\4\2\2y\u0086\3\2\2\2z\u0086\5\20\t\2{\u0086\5"+
		"\34\17\2|}\7\f\2\2}\u0086\5\66\34\2~\u0086\5:\36\2\177\u0086\5<\37\2\u0080"+
		"\u0086\5> \2\u0081\u0086\5@!\2\u0082\u0086\5B\"\2\u0083\u0086\5D#\2\u0084"+
		"\u0086\5H%\2\u0085v\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2"+
		"\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3"+
		"\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\17\3\2\2\2\u0087\u008e\5\30\r\2\u0088\u0089\5\22\n\2\u0089\u008a\7\3"+
		"\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\t\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090\t\2\2"+
		"\2\u0090\23\3\2\2\2\u0091\u0097\5\26\f\2\u0092\u0093\5\26\f\2\u0093\u0094"+
		"\7\5\2\2\u0094\u0095\5\24\13\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2"+
		"\u0096\u0092\3\2\2\2\u0097\25\3\2\2\2\u0098\u009d\7\33\2\2\u0099\u009a"+
		"\7\33\2\2\u009a\u009b\7\6\2\2\u009b\u009d\7\33\2\2\u009c\u0098\3\2\2\2"+
		"\u009c\u0099\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\7\35\2\2\u009f\u00a0"+
		"\5\32\16\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2\7\37\2\2\u00a2\u00a3\5\32"+
		"\16\2\u00a3\31\3\2\2\2\u00a4\u00a5\7 \2\2\u00a5\33\3\2\2\2\u00a6\u00a9"+
		"\5\36\20\2\u00a7\u00a9\5\60\31\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\35\3\2\2\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad"+
		"\7-\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\5&\24\2\u00af\37\3\2\2\2\u00b0"+
		"\u00b7\7#\2\2\u00b1\u00b7\7$\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\5\"\22"+
		"\2\u00b4\u00b5\7\t\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00be\5$\23\2\u00b9"+
		"\u00ba\5$\23\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0"+
		"\7\33\2\2\u00c0%\3\2\2\2\u00c1\u00c5\7%\2\2\u00c2\u00c5\7&\2\2\u00c3\u00c5"+
		"\5(\25\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\'\3\2\2\2\u00c6\u00cc\5*\26\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\7\5\2\2"+
		"\u00c9\u00ca\5(\25\2\u00ca\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7"+
		"\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00d3\5.\30\2\u00ce\u00cf\7\7\2\2\u00cf"+
		"\u00d0\5,\27\2\u00d0\u00d1\7\4\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2"+
		"\2\2\u00d2\u00ce\3\2\2\2\u00d3+\3\2\2\2\u00d4\u00da\5.\30\2\u00d5\u00d6"+
		"\5.\30\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5,\27\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da-\3\2\2\2\u00db\u00dc\7\33\2\2"+
		"\u00dc/\3\2\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\7!\2\2\u00df\u00e0\5\62"+
		"\32\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\5&\24\2\u00e3"+
		"\61\3\2\2\2\u00e4\u00ea\7(\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\5\64\33"+
		"\2\u00e7\u00e8\7\t\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5"+
		"\3\2\2\2\u00ea\63\3\2\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\7\60\2\2\u00ed"+
		"\u00ee\5$\23\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7\60"+
		"\2\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5\64\33\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\65\3\2\2"+
		"\2\u00f7\u00fe\7)\2\2\u00f8\u00fe\7*\2\2\u00f9\u00fe\7+\2\2\u00fa\u00fb"+
		"\7+\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fe\58\35\2\u00fd\u00f7\3\2\2\2\u00fd"+
		"\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\67\3\2\2"+
		"\2\u00ff\u0105\5\22\n\2\u0100\u0101\5\22\n\2\u0101\u0102\7\5\2\2\u0102"+
		"\u0103\58\35\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2"+
		"\2\2\u01059\3\2\2\2\u0106\u010a\7\r\2\2\u0107\u010a\7\16\2\2\u0108\u010a"+
		"\7\17\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2"+
		"\u010a;\3\2\2\2\u010b\u010c\7\20\2\2\u010c\u010d\7\33\2\2\u010d=\3\2\2"+
		"\2\u010e\u010f\7\61\2\2\u010f\u0113\7\33\2\2\u0110\u0111\7\62\2\2\u0111"+
		"\u0113\7\34\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0113?\3\2\2\2"+
		"\u0114\u0117\7\21\2\2\u0115\u0117\7\22\2\2\u0116\u0114\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117A\3\2\2\2\u0118\u011c\7\23\2\2\u0119\u011c\7\24\2\2\u011a"+
		"\u011c\7\25\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3"+
		"\2\2\2\u011cC\3\2\2\2\u011d\u0120\7\63\2\2\u011e\u0120\7\64\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120E\3\2\2\2\u0121\u0122\7;\2\2\u0122"+
		"G\3\2\2\2\u0123\u012a\7\65\2\2\u0124\u012a\7\66\2\2\u0125\u012a\7\67\2"+
		"\2\u0126\u012a\78\2\2\u0127\u012a\79\2\2\u0128\u012a\7:\2\2\u0129\u0123"+
		"\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012aI\3\2\2\2\34PYcnt\u0085\u008d"+
		"\u0096\u009c\u00a8\u00b6\u00bd\u00c4\u00cb\u00d2\u00d9\u00e9\u00f5\u00fd"+
		"\u0104\u0109\u0112\u0116\u011b\u011f\u0129";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}