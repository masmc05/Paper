package org.bukkit.profile;

import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides access to the textures stored inside a {@link PlayerProfile}.
 * <p>
 * Modifying the textures immediately invalidates and clears any previously
 * present attributes that are specific to official player profiles, such as the
 * {@link #getTimestamp() timestamp} and {@link #isSigned() signature}.
 *
 * @since 1.18.1
 */
public interface PlayerTextures {

    /**
     * The different Minecraft skin models.
     *
     * @since 1.18.1
     */
    enum SkinModel {
        /**
         * The classic Minecraft skin model.
         *
         * @since 1.18.1
         */
        CLASSIC,
        /**
         * The slim model has slimmer arms than the classic model.
         *
         * @since 1.18.1
         */
        SLIM;
    }

    /**
     * Checks if the profile stores no textures.
     *
     * @return {@code true} if the profile stores no textures
     * @since 1.18.1
     */
    boolean isEmpty();

    /**
     * Clears the textures.
     *
     * @since 1.18.1
     */
    void clear();

    /**
     * Gets the URL that points to the player's skin.
     *
     * @return the URL of the player's skin, or {@code null} if not set
     * @since 1.18.1
     */
    @Nullable
    URL getSkin();

    /**
     * Sets the player's skin to the specified URL, and the skin model to
     * {@link SkinModel#CLASSIC}.
     * <p>
     * The URL <b>must</b> point to the Minecraft texture server. Example URL:
     * <pre>
     * http://textures.minecraft.net/texture/b3fbd454b599df593f57101bfca34e67d292a8861213d2202bb575da7fd091ac
     * </pre>
     *
     * @param skinUrl the URL of the player's skin, or {@code null} to
     * unset it
     * @since 1.18.1
     */
    void setSkin(@Nullable URL skinUrl);

    /**
     * Sets the player's skin and {@link SkinModel}.
     * <p>
     * The URL <b>must</b> point to the Minecraft texture server. Example URL:
     * <pre>
     * http://textures.minecraft.net/texture/b3fbd454b599df593f57101bfca34e67d292a8861213d2202bb575da7fd091ac
     * </pre>
     * <p>
     * A skin model of {@code null} results in {@link SkinModel#CLASSIC} to
     * be used.
     *
     * @param skinUrl the URL of the player's skin, or {@code null} to
     * unset it
     * @param skinModel the skin model, ignored if the skin URL is
     * {@code null}
     * @since 1.18.1
     */
    void setSkin(@Nullable URL skinUrl, @Nullable SkinModel skinModel);

    /**
     * Gets the model of the player's skin.
     * <p>
     * This returns {@link SkinModel#CLASSIC} if no skin is set.
     *
     * @return the model of the player's skin
     * @since 1.18.1
     */
    @NotNull
    SkinModel getSkinModel();

    /**
     * Gets the URL that points to the player's cape.
     *
     * @return the URL of the player's cape, or {@code null} if not set
     * @since 1.18.1
     */
    @Nullable
    URL getCape();

    /**
     * Sets the URL that points to the player's cape.
     * <p>
     * The URL <b>must</b> point to the Minecraft texture server. Example URL:
     * <pre>
     * http://textures.minecraft.net/texture/2340c0e03dd24a11b15a8b33c2a7e9e32abb2051b2481d0ba7defd635ca7a933
     * </pre>
     *
     * @param capeUrl the URL of the player's cape, or {@code null} to
     * unset it
     * @since 1.18.1
     */
    void setCape(@Nullable URL capeUrl);

    /**
     * Gets the timestamp at which the profile was last updated.
     *
     * @return the timestamp, or {@code 0} if unknown
     * @since 1.18.1
     */
    long getTimestamp();

    /**
     * Checks if the textures are signed and the signature is valid.
     *
     * @return {@code true} if the textures are signed and the signature is
     * valid
     * @since 1.18.1
     */
    boolean isSigned();
}
