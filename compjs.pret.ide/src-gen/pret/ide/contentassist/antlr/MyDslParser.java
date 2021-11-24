/*
 * generated by Xtext 2.25.0
 */
package pret.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pret.ide.contentassist.antlr.internal.InternalMyDslParser;
import pret.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getExprBaseAccess().getAlternatives(), "rule__ExprBase__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_5(), "rule__If__Group_5__0");
			builder.put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
			builder.put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
			builder.put(grammarAccess.getForeachAccess().getGroup(), "rule__Foreach__Group__0");
			builder.put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
			builder.put(grammarAccess.getVarsAccess().getGroup_1(), "rule__Vars__Group_1__0");
			builder.put(grammarAccess.getExprsAccess().getGroup(), "rule__Exprs__Group__0");
			builder.put(grammarAccess.getExprsAccess().getGroup_1(), "rule__Exprs__Group_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_0(), "rule__ExprBase__Group_0__0");
			builder.put(grammarAccess.getEBsyAccess().getGroup(), "rule__EBsy__Group__0");
			builder.put(grammarAccess.getEBhdAccess().getGroup(), "rule__EBhd__Group__0");
			builder.put(grammarAccess.getEBtlAccess().getGroup(), "rule__EBtl__Group__0");
			builder.put(grammarAccess.getEBconsAccess().getGroup(), "rule__EBcons__Group__0");
			builder.put(grammarAccess.getEBlistAccess().getGroup(), "rule__EBlist__Group__0");
			builder.put(grammarAccess.getLExprAccess().getGroup(), "rule__LExpr__Group__0");
			builder.put(grammarAccess.getModelAccess().getProgrammeAssignment(), "rule__Model__ProgrammeAssignment");
			builder.put(grammarAccess.getProgramAccess().getFuncAssignment(), "rule__Program__FuncAssignment");
			builder.put(grammarAccess.getFunctionAccess().getFnameAssignment_1(), "rule__Function__FnameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getFdefAssignment_3(), "rule__Function__FdefAssignment_3");
			builder.put(grammarAccess.getDefinitionAccess().getDefInputAssignment_1(), "rule__Definition__DefInputAssignment_1");
			builder.put(grammarAccess.getDefinitionAccess().getDefCommandsAssignment_5(), "rule__Definition__DefCommandsAssignment_5");
			builder.put(grammarAccess.getDefinitionAccess().getDefOutputAssignment_9(), "rule__Definition__DefOutputAssignment_9");
			builder.put(grammarAccess.getInputAccess().getVaiAssignment_0(), "rule__Input__VaiAssignment_0");
			builder.put(grammarAccess.getInputAccess().getVaiAssignment_1_1(), "rule__Input__VaiAssignment_1_1");
			builder.put(grammarAccess.getOutputAccess().getVaoAssignment_0(), "rule__Output__VaoAssignment_0");
			builder.put(grammarAccess.getOutputAccess().getVaoAssignment_1_1(), "rule__Output__VaoAssignment_1_1");
			builder.put(grammarAccess.getCommandsAccess().getLCommandAssignment_0(), "rule__Commands__LCommandAssignment_0");
			builder.put(grammarAccess.getCommandsAccess().getLCommandAssignment_1_1(), "rule__Commands__LCommandAssignment_1_1");
			builder.put(grammarAccess.getCommandAccess().getEqAssignment_0(), "rule__Command__EqAssignment_0");
			builder.put(grammarAccess.getCommandAccess().getIfAssignment_1(), "rule__Command__IfAssignment_1");
			builder.put(grammarAccess.getCommandAccess().getWhAssignment_2(), "rule__Command__WhAssignment_2");
			builder.put(grammarAccess.getCommandAccess().getFoAssignment_3(), "rule__Command__FoAssignment_3");
			builder.put(grammarAccess.getCommandAccess().getForeAssignment_4(), "rule__Command__ForeAssignment_4");
			builder.put(grammarAccess.getCommandAccess().getNoAssignment_5(), "rule__Command__NoAssignment_5");
			builder.put(grammarAccess.getEqualAccess().getVarsAssignment_0(), "rule__Equal__VarsAssignment_0");
			builder.put(grammarAccess.getEqualAccess().getExpAssignment_2(), "rule__Equal__ExpAssignment_2");
			builder.put(grammarAccess.getIfAccess().getExpAssignment_1(), "rule__If__ExpAssignment_1");
			builder.put(grammarAccess.getIfAccess().getIflcAssignment_4(), "rule__If__IflcAssignment_4");
			builder.put(grammarAccess.getIfAccess().getEllcAssignment_5_2(), "rule__If__EllcAssignment_5_2");
			builder.put(grammarAccess.getWhileAccess().getExpAssignment_1(), "rule__While__ExpAssignment_1");
			builder.put(grammarAccess.getWhileAccess().getWhcomAssignment_4(), "rule__While__WhcomAssignment_4");
			builder.put(grammarAccess.getForAccess().getExpAssignment_1(), "rule__For__ExpAssignment_1");
			builder.put(grammarAccess.getForAccess().getFocomAssignment_4(), "rule__For__FocomAssignment_4");
			builder.put(grammarAccess.getForeachAccess().getForevarAssignment_1(), "rule__Foreach__ForevarAssignment_1");
			builder.put(grammarAccess.getForeachAccess().getExpAssignment_3(), "rule__Foreach__ExpAssignment_3");
			builder.put(grammarAccess.getForeachAccess().getForecomAssignment_6(), "rule__Foreach__ForecomAssignment_6");
			builder.put(grammarAccess.getVarsAccess().getLvarsAssignment_0(), "rule__Vars__LvarsAssignment_0");
			builder.put(grammarAccess.getVarsAccess().getLvarsAssignment_1_1(), "rule__Vars__LvarsAssignment_1_1");
			builder.put(grammarAccess.getExprsAccess().getLexprAssignment_0(), "rule__Exprs__LexprAssignment_0");
			builder.put(grammarAccess.getExprsAccess().getLexprAssignment_1_1(), "rule__Exprs__LexprAssignment_1_1");
			builder.put(grammarAccess.getExpressionAccess().getExpbgAssignment_0(), "rule__Expression__ExpbgAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getExpbdAssignment_1_1(), "rule__Expression__ExpbdAssignment_1_1");
			builder.put(grammarAccess.getExprBaseAccess().getNiAssignment_0_1(), "rule__ExprBase__NiAssignment_0_1");
			builder.put(grammarAccess.getExprBaseAccess().getVAssignment_1(), "rule__ExprBase__VAssignment_1");
			builder.put(grammarAccess.getExprBaseAccess().getSyAssignment_2(), "rule__ExprBase__SyAssignment_2");
			builder.put(grammarAccess.getExprBaseAccess().getEbtAssignment_3(), "rule__ExprBase__EbtAssignment_3");
			builder.put(grammarAccess.getExprBaseAccess().getEblAssignment_4(), "rule__ExprBase__EblAssignment_4");
			builder.put(grammarAccess.getExprBaseAccess().getEbcAssignment_5(), "rule__ExprBase__EbcAssignment_5");
			builder.put(grammarAccess.getExprBaseAccess().getEbhAssignment_6(), "rule__ExprBase__EbhAssignment_6");
			builder.put(grammarAccess.getExprBaseAccess().getEbsAssignment_7(), "rule__ExprBase__EbsAssignment_7");
			builder.put(grammarAccess.getEBsyAccess().getSyAssignment_1(), "rule__EBsy__SyAssignment_1");
			builder.put(grammarAccess.getEBsyAccess().getLeAssignment_2(), "rule__EBsy__LeAssignment_2");
			builder.put(grammarAccess.getEBhdAccess().getExpbAssignment_2(), "rule__EBhd__ExpbAssignment_2");
			builder.put(grammarAccess.getEBtlAccess().getExpbAssignment_2(), "rule__EBtl__ExpbAssignment_2");
			builder.put(grammarAccess.getEBconsAccess().getLexpbAssignment_3(), "rule__EBcons__LexpbAssignment_3");
			builder.put(grammarAccess.getEBlistAccess().getLeAssignment_2(), "rule__EBlist__LeAssignment_2");
			builder.put(grammarAccess.getLExprAccess().getLexpbAssignment_0(), "rule__LExpr__LexpbAssignment_0");
			builder.put(grammarAccess.getLExprAccess().getLexpbAssignment_1(), "rule__LExpr__LexpbAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}