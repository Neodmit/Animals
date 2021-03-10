package rules;

public class RulesParameters {
    private ListsRules includeParams;
    private ListsRules excludeParams;
    private String description;

    public RulesParameters(ListsRules includeParams, ListsRules excludeParams, String description) {
        this.includeParams = includeParams;
        this.excludeParams = excludeParams;
        this.description = description;
    }

    public ListsRules getIncludeParams() {
        return includeParams;
    }

    public ListsRules getExcludeParams() {
        return excludeParams;
    }

    public String getDescription() {
        return description;
    }
}
