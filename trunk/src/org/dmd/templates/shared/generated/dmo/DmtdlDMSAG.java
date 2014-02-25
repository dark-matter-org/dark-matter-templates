package org.dmd.templates.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1079)
import java.util.ArrayList;                                                                 // For storage of schema info - (DmoCompactSchemaFormatter.java:1013)
import java.util.HashMap;                                                                   // For storage of schema info - (DmoCompactSchemaFormatter.java:1012)
import java.util.Iterator;                                                                  // For access of schema info - (DmoCompactSchemaFormatter.java:1014)
import org.dmd.dmc.*;                                                                       // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1015)
import org.dmd.dmc.rules.RuleIF;                                                            // For rule info - (DmoCompactSchemaFormatter.java:1016)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                 // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1032)
import org.dmd.dms.generated.enums.ClassTypeEnum;                                           // Have class definitions - (DmoCompactSchemaFormatter.java:1020)
import org.dmd.dms.generated.enums.DataTypeEnum;                                            // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1021)
import org.dmd.dms.generated.enums.OriginalTypeEnum;                                        // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1026)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                           // Have attribute definitions - (DmoCompactSchemaFormatter.java:1047)
import org.dmd.dmv.shared.extended.rulesdmo.OnlyOneOfTheseAttributesAllowedRule;            // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1073)
import org.dmd.dmv.shared.extended.rulesdmo.PatternMatchRule;                               // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1073)
import org.dmd.dmv.shared.extended.rulesdmo.ValueLengthRule;                                // To instantiate rules of this type - (DmoCompactSchemaFormatter.java:1073)
import org.dmd.dmv.shared.generated.dmo.OnlyOneOfTheseAttributesAllowedRuleDataDMO;         // To instantiate OnlyOneOfTheseAttributesAllowedRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.PatternMatchRuleDataDMO;                            // To instantiate PatternMatchRuleData rule data - (DmoCompactSchemaFormatter.java:1072)
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;                             // To instantiate ValueLengthRuleData rule data - (DmoCompactSchemaFormatter.java:1072)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class DmtdlDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmtdl";


    static int schemaBaseID = -478600;


    static int schemaIDRange = 50;


    static int schemaMaxID = -478550;

    public final static DmcAttributeInfo __commentFormat = new DmcAttributeInfo("dmtdl", "commentFormat", -478583, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __contains = new DmcAttributeInfo("dmtdl", "contains", -478594, "Contains", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __debugOn = new DmcAttributeInfo("dmtdl", "debugOn", -478582, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __definedInTdlModule = new DmcAttributeInfo("dmtdl", "definedInTdlModule", -478599, "TdlModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnTdlModule = new DmcAttributeInfo("dmtdl", "dependsOnTdlModule", -478598, "TdlModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __endsWith = new DmcAttributeInfo("dmtdl", "endsWith", -478591, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __endsWithText = new DmcAttributeInfo("dmtdl", "endsWithText", -478590, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __format = new DmcAttributeInfo("dmtdl", "format", -478596, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __hasTemplate = new DmcAttributeInfo("dmtdl", "hasTemplate", -478586, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __insertMarker = new DmcAttributeInfo("dmtdl", "insertMarker", -478597, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __maxFastAddValues = new DmcAttributeInfo("dmtdl", "maxFastAddValues", -478584, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __package = new DmcAttributeInfo("dmtdl", "package", -478587, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __startsWith = new DmcAttributeInfo("dmtdl", "startsWith", -478593, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __startsWithText = new DmcAttributeInfo("dmtdl", "startsWithText", -478592, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("dmtdl", "targetObjectClass", -478580, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __templateFile = new DmcAttributeInfo("dmtdl", "templateFile", -478588, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __templateFileSuffix = new DmcAttributeInfo("dmtdl", "templateFileSuffix", -478585, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesSection = new DmcAttributeInfo("dmtdl", "usesSection", -478581, "Section", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesTemplate = new DmcAttributeInfo("dmtdl", "usesTemplate", -478595, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __value = new DmcAttributeInfo("dmtdl", "value", -478589, "Value", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:183)
    public final static DmcTypeInfo __type_CardinalityEnum = new DmcTypeInfo("CardinalityEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_ContainedElement = new DmcTypeInfo("ContainedElement", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Contains = new DmcTypeInfo("Contains", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_ExtensionHook = new DmcTypeInfo("ExtensionHook", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Section = new DmcTypeInfo("Section", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TdlDefinition = new DmcTypeInfo("TdlDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TdlModule = new DmcTypeInfo("TdlModule", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Template = new DmcTypeInfo("Template", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_TextualArtifact = new DmcTypeInfo("TextualArtifact", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Value = new DmcTypeInfo("Value", OriginalTypeEnum.COMPLEXTYPE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:224)
    public final static DmcClassInfo __TdlDefinition = new DmcClassInfo("TdlDefinition","org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO", -478598, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__DSDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ContainedElement = new DmcClassInfo("ContainedElement","org.dmd.templates.shared.generated.dmo.ContainedElementDMO", -478597, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __ExtensionHook = new DmcClassInfo("ExtensionHook","org.dmd.templates.shared.generated.dmo.ExtensionHookDMO", -478594, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ContainedElement,MetaDMSAG.__name);
    public final static DmcClassInfo __Section = new DmcClassInfo("Section","org.dmd.templates.shared.generated.dmo.SectionDMO", -478596, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ContainedElement,MetaDMSAG.__name);
    public final static DmcClassInfo __TdlModule = new DmcClassInfo("TdlModule","org.dmd.templates.shared.generated.dmo.TdlModuleDMO", -478599, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __TextualArtifact = new DmcClassInfo("TextualArtifact","org.dmd.templates.shared.generated.dmo.TextualArtifactDMO", -478595, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__TdlDefinition,MetaDMSAG.__name);
    public final static DmcClassInfo __Template = new DmcClassInfo("Template","org.dmd.templates.shared.generated.dmo.TemplateDMO", -478593, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__name);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:253)
    public final static PatternMatchRule __dmtdlCommentFormat;
    public final static OnlyOneOfTheseAttributesAllowedRule __dmtdlEndsWith;
    public final static ValueLengthRule __dmtdlInsertMarkerLength;
    public final static OnlyOneOfTheseAttributesAllowedRule __dmtdlStartsWith;
    public final static PatternMatchRule __dmtdlTargetObjectClass;

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmtdlDMSAGAMAP.initSmAp(_SmAp);

        DmtdlDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:307)
    static {


        __TdlDefinition.addMust(MetaDMSAG.__name);
        __TdlDefinition.addMust(MetaDMSAG.__dotName);
        __TdlDefinition.addMust(__definedInTdlModule);
        __TdlDefinition.addMay(MetaDMSAG.__description);

        __ContainedElement.addMust(MetaDMSAG.__name);

        __Section.addMust(MetaDMSAG.__name);
        __Section.addMay(__contains);
        __Section.addMay(__startsWith);
        __Section.addMay(__endsWith);
        __Section.addMay(__startsWithText);
        __Section.addMay(__endsWithText);
        __Section.addMay(__value);
        __Section.addMay(__hasTemplate);
        __Section.addMay(__usesTemplate);

        __TextualArtifact.addMust(MetaDMSAG.__name);
        __TextualArtifact.addMust(__contains);

        __ExtensionHook.addMust(MetaDMSAG.__name);
        __ExtensionHook.addMust(__usesSection);
        __ExtensionHook.addMust(__targetObjectClass);

        __Template.addMust(MetaDMSAG.__name);
        __Template.addMust(__format);
        __Template.addMay(MetaDMSAG.__file);
        __Template.addMay(MetaDMSAG.__lineNumber);
        __Template.addMay(__debugOn);
        __Template.addMay(MetaDMSAG.__description);

        __TdlModule.addMust(MetaDMSAG.__name);
        __TdlModule.addMust(__package);
        __TdlModule.addMust(__templateFile);
        __TdlModule.addMay(MetaDMSAG.__description);
        __TdlModule.addMay(MetaDMSAG.__defFiles);
        __TdlModule.addMay(__templateFileSuffix);
        __TdlModule.addMay(__maxFastAddValues);
        __TdlModule.addMay(__insertMarker);
        __TdlModule.addMay(__commentFormat);
        __TdlModule.addMay(__dependsOnTdlModule);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:351)
    static {


        // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:370)
        try{
            PatternMatchRuleDataDMO _dmtdlCommentFormatData = new PatternMatchRuleDataDMO();
            _dmtdlCommentFormatData      .setRuleName("dmtdlCommentFormat");
            _dmtdlCommentFormatData      .setRuleTitle("The commentFormat must contain the value insertion ::comment::");
            _dmtdlCommentFormatData      .setMatchesPattern(".*::comment::.*");
            _dmtdlCommentFormatData      .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlCommentFormatData      .setDefinedIn("dmtdl");
            _dmtdlCommentFormatData      .setLineNumber("159");

            __dmtdlCommentFormat = new PatternMatchRule(_dmtdlCommentFormatData);

            _RmAp.add(__dmtdlCommentFormat);

            OnlyOneOfTheseAttributesAllowedRuleDataDMO _dmtdlEndsWithData = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
            _dmtdlEndsWithData           .setRuleName("dmtdlEndsWith");
            _dmtdlEndsWithData           .setApplyToClass("Section");
            _dmtdlEndsWithData           .setRuleTitle("A Section can only endWith another Section or with a static piece of text.");
            _dmtdlEndsWithData           .addOnePossibility("endsWith");
            _dmtdlEndsWithData           .addOnePossibility("endsWithText");
            _dmtdlEndsWithData           .setFile("/src/org/dmd/templates/shared/dmdconfig/classes.dmd");
            _dmtdlEndsWithData           .setDefinedIn("dmtdl");
            _dmtdlEndsWithData           .setLineNumber("84");

            __dmtdlEndsWith = new OnlyOneOfTheseAttributesAllowedRule(_dmtdlEndsWithData);

            _RmAp.add(__dmtdlEndsWith);

            ValueLengthRuleDataDMO _dmtdlInsertMarkerLengthData = new ValueLengthRuleDataDMO();
            _dmtdlInsertMarkerLengthData .setRuleName("dmtdlInsertMarkerLength");
            _dmtdlInsertMarkerLengthData .setRuleTitle("The insert marker must be 2 - 3 characters long.");
            _dmtdlInsertMarkerLengthData .setApplyToAttribute("insertMarker");
            _dmtdlInsertMarkerLengthData .setMaxLength("3");
            _dmtdlInsertMarkerLengthData .setMinLength("2");
            _dmtdlInsertMarkerLengthData .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlInsertMarkerLengthData .setDefinedIn("dmtdl");
            _dmtdlInsertMarkerLengthData .setLineNumber("39");

            __dmtdlInsertMarkerLength = new ValueLengthRule(_dmtdlInsertMarkerLengthData);

            _RmAp.add(__dmtdlInsertMarkerLength);

            OnlyOneOfTheseAttributesAllowedRuleDataDMO _dmtdlStartsWithData = new OnlyOneOfTheseAttributesAllowedRuleDataDMO();
            _dmtdlStartsWithData         .setRuleName("dmtdlStartsWith");
            _dmtdlStartsWithData         .setApplyToClass("Section");
            _dmtdlStartsWithData         .setRuleTitle("A Section can only startWith another Section or with a static piece of text.");
            _dmtdlStartsWithData         .addOnePossibility("startsWith");
            _dmtdlStartsWithData         .addOnePossibility("startsWithText");
            _dmtdlStartsWithData         .setFile("/src/org/dmd/templates/shared/dmdconfig/classes.dmd");
            _dmtdlStartsWithData         .setDefinedIn("dmtdl");
            _dmtdlStartsWithData         .setLineNumber("65");

            __dmtdlStartsWith = new OnlyOneOfTheseAttributesAllowedRule(_dmtdlStartsWithData);

            _RmAp.add(__dmtdlStartsWith);

            PatternMatchRuleDataDMO _dmtdlTargetObjectClassData = new PatternMatchRuleDataDMO();
            _dmtdlTargetObjectClassData  .setRuleName("dmtdlTargetObjectClass");
            _dmtdlTargetObjectClassData  .setRuleTitle("The targetObjectClass must be a valid, fully qualified, Java class name.");
            _dmtdlTargetObjectClassData  .setMatchesPattern("([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*");
            _dmtdlTargetObjectClassData  .setFile("/src/org/dmd/templates/shared/dmdconfig/attributes.dmd");
            _dmtdlTargetObjectClassData  .setDefinedIn("dmtdl");
            _dmtdlTargetObjectClassData  .setLineNumber("193");

            __dmtdlTargetObjectClass = new PatternMatchRule(_dmtdlTargetObjectClassData);

            _RmAp.add(__dmtdlTargetObjectClass);

        } catch(DmcValueException ex){
            throw(new IllegalStateException(ex));
        }

    }

    static  DmtdlDMSAG instance;

    protected DmtdlDMSAG (){
    }

    public synchronized static DmtdlDMSAG instance(){
        if (instance == null)
            instance = new DmtdlDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

