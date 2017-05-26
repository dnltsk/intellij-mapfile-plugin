package org.dnltsk.mapfileplugin.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.dnltsk.mapfileplugin.psi.MapfileTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MapfileBlock extends AbstractBlock {

    private SpacingBuilder spacingBuilder;
    private int depth;

    protected MapfileBlock(int depth, @NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment, SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.depth = depth;
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE) {
                int newDepth = calcChildDepth(depth);
                MapfileBlock childBlock = new MapfileBlock(
                        newDepth,
                        child,
                        Wrap.createWrap(WrapType.NORMAL, true),
                        Alignment.createAlignment(),
                        spacingBuilder);
                blocks.add(childBlock);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    private int calcChildDepth(int depth) {
        if (this.getNode().getElementType() == MapfileTypes.CLASS_OBJECT
                || this.getNode().getElementType() == MapfileTypes.COMPOSITE_OBJECT
                || this.getNode().getElementType() == MapfileTypes.FEATURE_OBJECT
                || this.getNode().getElementType() == MapfileTypes.GRID_OBJECT
                || this.getNode().getElementType() == MapfileTypes.JOIN_OBJECT
                || this.getNode().getElementType() == MapfileTypes.LABEL_OBJECT
                || this.getNode().getElementType() == MapfileTypes.LAYER_OBJECT
                || this.getNode().getElementType() == MapfileTypes.LEADER_OBJECT
                || this.getNode().getElementType() == MapfileTypes.LEGEND_OBJECT
                || this.getNode().getElementType() == MapfileTypes.MAP_OBJECT
                || this.getNode().getElementType() == MapfileTypes.METADATA_OBJECT
                || this.getNode().getElementType() == MapfileTypes.OUTPUTFORMAT_OBJECT
                || this.getNode().getElementType() == MapfileTypes.QUERYMAP_OBJECT
                || this.getNode().getElementType() == MapfileTypes.REFERENCE_OBJECT
                || this.getNode().getElementType() == MapfileTypes.SCALEBAR_OBJECT
                || this.getNode().getElementType() == MapfileTypes.STYLE_OBJECT
                || this.getNode().getElementType() == MapfileTypes.SYMBOL_OBJECT
                || this.getNode().getElementType() == MapfileTypes.WEB_OBJECT) {
            return depth + 1;
        }
        return depth;
    }

    @Override
    public Indent getIndent() {
        if (this.getNode().getElementType() == MapfileTypes.CLASS_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.COMPOSITE_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.FEATURE_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.GRID_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.JOIN_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.LABEL_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.LAYER_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.LEADER_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.LEGEND_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.MAP_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.METADATA_OBJECT
                || this.getNode().getElementType() == MapfileTypes.OUTPUTFORMAT_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.QUERYMAP_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.REFERENCE_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.SCALEBAR_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.STYLE_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.SYMBOL_OBJECT_CHILDREN
                || this.getNode().getElementType() == MapfileTypes.WEB_OBJECT_CHILDREN
                || (this.depth > 0 && this.getNode().getElementType() == MapfileTypes.COMMENT)
                ) {
            return Indent.getNormalIndent();
        }
        return Indent.getNoneIndent();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}