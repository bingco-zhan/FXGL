/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2016 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package sandbox;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.Entities;
import com.almasb.fxgl.entity.ScrollingBackgroundView;
import com.almasb.fxgl.input.UserAction;
import com.almasb.fxgl.settings.GameSettings;
import javafx.geometry.Orientation;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import org.controlsfx.control.Rating;

/**
 * This is an example of a basic FXGL game application.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class RatingSample extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("RatingSample");
        settings.setVersion("0.1");
        settings.setFullScreen(false);
        settings.setIntroEnabled(false);
        settings.setMenuEnabled(false);
        settings.setProfilingEnabled(true);
        settings.setCloseConfirmation(false);
        settings.setApplicationMode(ApplicationMode.DEVELOPER);
    }

    @Override
    protected void initInput() {

        getInput().addAction(new UserAction("Move Right") {
            @Override
            protected void onAction() {
                getGameScene().getViewport().setX(getGameScene().getViewport().getX() + 10);
            }
        }, KeyCode.D);

        getInput().addAction(new UserAction("Move Left") {
            @Override
            protected void onAction() {
                getGameScene().getViewport().setX(getGameScene().getViewport().getX() - 10);
            }
        }, KeyCode.A);

        getInput().addAction(new UserAction("Move Up") {
            @Override
            protected void onAction() {
                getGameScene().getViewport().setY(getGameScene().getViewport().getY() - 10);
            }
        }, KeyCode.W);

        getInput().addAction(new UserAction("Move Down") {
            @Override
            protected void onAction() {
                getGameScene().getViewport().setY(getGameScene().getViewport().getY() + 10);
            }
        }, KeyCode.S);
    }

    @Override
    protected void initAssets() {}

    private Image bgImage;

    @Override
    protected void initGame() {
        //bgImage = getAssetLoader().loadTexture("bg_wrap.png", 1280, 720).getImage();

        getGameScene().addGameView(new ScrollingBackgroundView(getAssetLoader().loadTexture("bg_wrap.png", 1066, 600),
                Orientation.VERTICAL));
//        Entities.builder()
//                .viewFromNode(getAssetLoader().loadTexture("bg_wrap.png", 1280, 720))
//                .buildAndAttach(getGameWorld());
    }

    @Override
    protected void initPhysics() {}

    @Override
    protected void initUI() {

//        Rating rating = new Rating(6, 1);
//        rating.setPartialRating(false);
//        rating.setUpdateOnHover(false);
//        //rating.setDisable(true);
//
//        getGameScene().addUINode(rating);

    }

    @Override
    protected void onUpdate(double tpf) {

//        double dx = getGameScene().getViewport().getX() % 1280;
//        double dy = getGameScene().getViewport().getY();
//
//        GraphicsContext g = getGameScene().getGraphicsContext();
//
//        double sx = dx;
//
//        if (sx < 0)
//            return;
//
//        g.drawImage(bgImage, sx, 0, 1280 - sx, 720,
//                            0, 0, 1280 - sx, 720);
//
//        g.drawImage(bgImage, 0, 0, sx, 720,
//                            1280 - sx, 0, sx, 720);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
