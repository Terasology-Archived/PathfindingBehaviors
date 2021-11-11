// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.module.pathfindingbehaviors.actions;

import org.terasology.engine.logic.behavior.BehaviorAction;
import org.terasology.engine.logic.behavior.core.Actor;
import org.terasology.engine.logic.behavior.core.BaseAction;
import org.terasology.engine.logic.behavior.core.BehaviorState;
import org.terasology.module.pathfindingbehaviors.move.MinionMoveComponent;

@BehaviorAction(name = "ensure_target_present")
public class EnsureTargetPresentAction extends BaseAction {
    @Override
    public BehaviorState modify(Actor actor, BehaviorState behaviorState) {
        MinionMoveComponent minionMoveComponent = actor.getComponent(MinionMoveComponent.class);

        if (minionMoveComponent.target != null) {
            return BehaviorState.SUCCESS;
        }
        return BehaviorState.FAILURE;
    }
}
