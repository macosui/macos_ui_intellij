package dev.groovinchip.macosintellij.liveTemplates;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class MacosUIContext extends TemplateContextType {

    protected MacosUIContext() {
        super("MACOSUI", "macos_ui");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".dart");
    }

}