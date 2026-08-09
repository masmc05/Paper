package org.bukkit.entity;

import com.google.common.base.Preconditions;
import org.bukkit.Color;
import org.bukkit.util.Transformation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

/**
 * Represents a display entity which is designed to only have a visual function.
 *
 * @since 1.19.4
 */
public interface Display extends Entity {

    /**
     * Gets the transformation applied to this display.
     *
     * @return the transformation
     * @since 1.19.4
     */
    @NotNull
    public Transformation getTransformation();

    /**
     * Sets the transformation applied to this display
     *
     * @param transformation the new transformation
     * @since 1.19.4
     */
    public void setTransformation(@NotNull Transformation transformation);

    /**
     * Sets the raw transformation matrix applied to this display
     *
     * @param transformationMatrix the transformation matrix
     * @since 1.19.4
     */
    public void setTransformationMatrix(@NotNull Matrix4f transformationMatrix);

    /**
     * Gets the interpolation duration of this display.
     *
     * @return interpolation duration
     * @since 1.19.4
     */
    public int getInterpolationDuration();

    /**
     * Sets the interpolation duration of this display.
     *
     * @param duration new duration
     * @since 1.19.4
     */
    public void setInterpolationDuration(int duration);

    /**
     * Gets the teleport duration of this display.
     * <ul>
     *     <li>0 means that updates are applied immediately.</li>
     *     <li>1 means that the display entity will move from current position to the updated one over one tick.</li>
     *     <li>Higher values spread the movement over multiple ticks.</li>
     * </ul>
     *
     * @return teleport duration
     * @since 1.20.2
     */
    public int getTeleportDuration();

    /**
     * Sets the teleport duration of this display.
     *
     * @param duration new duration
     * @throws IllegalArgumentException if duration is not between 0 and 59
     * @see #getTeleportDuration()
     * @since 1.20.2
     */
    public void setTeleportDuration(int duration);

    /**
     * Gets the view distance/range of this display.
     *
     * @return view range
     * @since 1.19.4
     */
    public float getViewRange();

    /**
     * Sets the view distance/range of this display.
     *
     * @param range new range
     * @since 1.19.4
     */
    public void setViewRange(float range);

    /**
     * Gets the shadow radius of this display.
     *
     * @return radius
     * @since 1.19.4
     */
    public float getShadowRadius();

    /**
     * Sets the shadow radius of this display.
     *
     * @param radius new radius
     * @since 1.19.4
     */
    public void setShadowRadius(float radius);

    /**
     * Gets the shadow strength of this display.
     *
     * @return shadow strength
     * @since 1.19.4
     */
    public float getShadowStrength();

    /**
     * Sets the shadow strength of this display.
     *
     * @param strength new strength
     * @since 1.19.4
     */
    public void setShadowStrength(float strength);

    /**
     * Gets the width of this display.
     *
     * @return width
     * @since 1.19.4
     */
    public float getDisplayWidth();

    /**
     * Sets the width of this display.
     *
     * @param width new width
     * @since 1.19.4
     */
    public void setDisplayWidth(float width);

    /**
     * Gets the height of this display.
     *
     * @return height
     * @since 1.19.4
     */
    public float getDisplayHeight();

    /**
     * Sets the height of this display.
     *
     * @param height new height
     * @since 1.19.4
     */
    public void setDisplayHeight(float height);

    /**
     * Gets the amount of ticks before client-side interpolation will commence.
     *
     * @return interpolation delay ticks
     * @since 1.19.4
     */
    public int getInterpolationDelay();

    /**
     * Sets the amount of ticks before client-side interpolation will commence.
     *
     * @param ticks interpolation delay ticks
     * @since 1.19.4
     */
    public void setInterpolationDelay(int ticks);

    /**
     * Gets the billboard setting of this entity.
     *
     * The billboard setting controls the automatic rotation of the entity to
     * face the player.
     *
     * @return billboard setting
     * @since 1.19.4
     */
    @NotNull
    public Billboard getBillboard();

    /**
     * Sets the billboard setting of this entity.
     *
     * The billboard setting controls the automatic rotation of the entity to
     * face the player.
     *
     * @param billboard new setting
     * @since 1.19.4
     */
    public void setBillboard(@NotNull Billboard billboard);

    /**
     * Gets the scoreboard team overridden glow color of this display.
     *
     * @return glow color
     * @since 1.19.4
     */
    @Nullable
    public Color getGlowColorOverride();

    /**
     * Sets the scoreboard team overridden glow color of this display.
     *
     * @param color new color
     * @since 1.19.4
     */
    public void setGlowColorOverride(@Nullable Color color);

    /**
     * Gets the brightness override of the entity.
     *
     * @return brightness override, if set
     * @since 1.19.4
     */
    @Nullable
    public Brightness getBrightness();

    /**
     * Sets the brightness override of the entity.
     *
     * @param brightness new brightness override
     * @since 1.19.4
     */
    public void setBrightness(@Nullable Brightness brightness);

    /**
     * Describes the axes/points around which the entity can pivot.
     *
     * @since 1.19.4
     */
    public enum Billboard {

        /**
         * No rotation (default).
         *
         * @since 1.19.4
         */
        FIXED,
        /**
         * Can pivot around vertical axis.
         *
         * @since 1.19.4
         */
        VERTICAL,
        /**
         * Can pivot around horizontal axis.
         *
         * @since 1.19.4
         */
        HORIZONTAL,
        /**
         * Can pivot around center point.
         *
         * @since 1.19.4
         */
        CENTER;
    }

    /**
     * Represents the brightness rendering parameters of the entity.
     *
     * @since 1.19.4
     */
    public static class Brightness {

        private final int blockLight;
        private final int skyLight;

        /**
         * @since 1.19.4
         */
        public Brightness(int blockLight, int skyLight) {
            Preconditions.checkArgument(0 <= blockLight && blockLight <= 15, "Block brightness out of range: %s", blockLight);
            Preconditions.checkArgument(0 <= skyLight && skyLight <= 15, "Sky brightness out of range: %s", skyLight);

            this.blockLight = blockLight;
            this.skyLight = skyLight;
        }

        /**
         * Gets the block lighting component of this brightness.
         *
         * @return block light, between 0-15
         * @since 1.19.4
         */
        public int getBlockLight() {
            return this.blockLight;
        }

        /**
         * Gets the sky lighting component of this brightness.
         *
         * @return sky light, between 0-15
         * @since 1.19.4
         */
        public int getSkyLight() {
            return this.skyLight;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 47 * hash + this.blockLight;
            hash = 47 * hash + this.skyLight;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Brightness other = (Brightness) obj;
            if (this.blockLight != other.blockLight) {
                return false;
            }
            return this.skyLight == other.skyLight;
        }

        @Override
        public String toString() {
            return "Brightness{" + "blockLight=" + this.blockLight + ", skyLight=" + this.skyLight + '}';
        }
    }
}
