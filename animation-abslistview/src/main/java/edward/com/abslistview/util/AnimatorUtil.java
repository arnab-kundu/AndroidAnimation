/*
 * Copyright 2014 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edward.com.abslistview.util;

import android.animation.Animator;

import androidx.annotation.NonNull;

public class AnimatorUtil {

    private AnimatorUtil() {
    }

    /**
     * Merges given Animators into one array.
     */
    @NonNull
    public static Animator[] concatAnimators(@NonNull final Animator[] childAnimators, @NonNull final Animator[] animators) {
        Animator[] allAnimators = new Animator[childAnimators.length + animators.length];
        int i;

        for (i = 0; i < childAnimators.length; ++i) {
            allAnimators[i] = childAnimators[i];
        }

        for (Animator animator : animators) {
            allAnimators[i] = animator;
            ++i;
        }
        return allAnimators;
    }

}
