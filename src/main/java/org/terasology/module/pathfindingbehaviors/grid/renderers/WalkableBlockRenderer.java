// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.module.pathfindingbehaviors.grid.renderers;

import org.joml.Vector3i;
import org.terasology.engine.entitySystem.systems.BaseComponentSystem;
import org.terasology.engine.entitySystem.systems.RegisterSystem;
import org.terasology.engine.registry.In;
import org.terasology.engine.registry.Share;
import org.terasology.module.pathfindingbehaviors.grid.BlockRenderer;
import org.terasology.joml.geom.Rectanglei;
import org.terasology.navgraph.NavGraphSystem;
import org.terasology.navgraph.WalkableBlock;
import org.terasology.nui.Canvas;
import org.terasology.nui.Color;

/**
 * Created by synopia on 12.02.14.
 */
@RegisterSystem
@Share(value = WalkableBlockRenderer.class)
public class WalkableBlockRenderer extends BaseComponentSystem implements BlockRenderer {
    @In
    private NavGraphSystem navGraphSystem;

    @Override
    public void renderBlock(Canvas canvas, Vector3i blockPos, Rectanglei screenRegion) {
        WalkableBlock block = navGraphSystem.getBlock(blockPos);
        if (block != null) {
            canvas.drawLine(screenRegion.minX, screenRegion.minY, screenRegion.minX + 1, screenRegion.minY, Color.GREEN);
        }
    }
}
