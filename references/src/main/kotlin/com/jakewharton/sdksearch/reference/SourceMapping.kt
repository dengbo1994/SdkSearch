package com.jakewharton.sdksearch.reference

import com.jakewharton.sdksearch.reference.SourceProject.BASE
import com.jakewharton.sdksearch.reference.SourceProject.CONSTRAINT_LAYOUT
import com.jakewharton.sdksearch.reference.SourceProject.DATABINDING
import com.jakewharton.sdksearch.reference.SourceProject.ICU
import com.jakewharton.sdksearch.reference.SourceProject.LIBCORE
import com.jakewharton.sdksearch.reference.SourceProject.MULTIDEX
import com.jakewharton.sdksearch.reference.SourceProject.SUPPORT
import com.jakewharton.sdksearch.reference.SourceProject.TELEPHONY
import com.jakewharton.sdksearch.reference.SourceProject.TESTING
import com.jakewharton.sdksearch.reference.SourceProject.UI_AUTOMATOR
import com.jakewharton.sdksearch.reference.SourceProject.VOIP

internal val SOURCE_MAP = mapOf(
    "android" to BASE.path("core/java/"),
    "android.Manifest" to null,

    "android.arch.core" to SUPPORT.path("app-toolkit/runtime/src/main/java/"),
    "android.arch.core.executor.testing" to SUPPORT.path("app-toolkit/core-testing/src/main/java/"),

    "android.arch.lifecycle" to SUPPORT.path("lifecycle/extensions/src/main/java/"),
    "android.arch.lifecycle.DefaultLifecycleObserver" to SUPPORT.path("lifecycle/common-java8/src/main/java/"),
    "android.arch.lifecycle.Lifecycle" to SUPPORT.path("lifecycle/common/src/main/java/"),
    "android.arch.lifecycle.LifecycleObserver" to SUPPORT.path("lifecycle/common/src/main/java/"),
    "android.arch.lifecycle.LifecycleOwner" to SUPPORT.path("lifecycle/common/src/main/java/"),
    "android.arch.lifecycle.LifecycleRegistry" to SUPPORT.path("lifecycle/runtime/src/main/java/"),
    "android.arch.lifecycle.LifecycleRegistryOwner" to SUPPORT.path("lifecycle/runtime/src/main/java/"),
    "android.arch.lifecycle.LiveDataReactiveStreams" to SUPPORT.path("lifecycle/reactivestreams/src/main/java/"),
    "android.arch.lifecycle.OnLifecycleEvent" to SUPPORT.path("lifecycle/common/src/main/java/"),

    "android.arch.paging" to SUPPORT.path("paging/common/src/main/java/"),
    "android.arch.paging.LivePagedListBuilder" to SUPPORT.path("paging/runtime/src/main/java/"),
    "android.arch.paging.LivePagedListProvider" to SUPPORT.path("paging/runtime/src/main/java/"),
    "android.arch.paging.PagedListAdapter" to SUPPORT.path("paging/runtime/src/main/java/"),
    "android.arch.paging.PagedListAdapterHelper" to SUPPORT.path("paging/runtime/src/main/java/"),

    "android.arch.persistence.db" to SUPPORT.path("persistence/db/src/main/java/"),
    "android.arch.persistence.db.framework" to SUPPORT.path("persistence/db-framework/src/main/java/"),
    "android.arch.persistence.room" to SUPPORT.path("room/common/src/main/java/"),
    "android.arch.persistence.room.DatabaseConfiguration" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.EmptyResultSetException" to SUPPORT.path("room/rxjava2/src/main/java/"),
    "android.arch.persistence.room.InvalidationTracker" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.Room" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.RoomDatabase" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.RxRoom" to SUPPORT.path("room/rxjava2/src/main/java/"),
    "android.arch.persistence.room.migration" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.testing" to SUPPORT.path("room/testing/src/main/java/"),

    "android.databinding" to DATABINDING.path("extensions/library/src/main/java/"),
    "android.databinding.Bindable" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingConversion" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingMethod" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingMethods" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.CallbackRegistry" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingListener" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingMethod" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingMethods" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.Observable" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.ObservableList" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.ObservableMap" to DATABINDING.path("baseLibrary/src/main/java/"),

    "android.drm" to BASE.path("drm/java/"),
    "android.drm.mobile1" to BASE.path("media/java/"),
    "android.renderscript" to BASE.path("rs/java/"),
    "android.graphics" to BASE.path("graphics/java/"),
    "android.icu" to ICU.path("android_icu4j/src/main/java/"),
    "android.security" to BASE.path("keystore/java/"),
    "android.security.NetworkSecurityPolicy" to BASE.path("core/java/"),
    "android.system" to LIBCORE.path("luni/src/main/java/"),
    "android.location" to BASE.path("location/java/"),
    "android.media" to BASE.path("media/java/"),
    "android.media.effect" to BASE.path("media/mca/effect/java/"),
    "android.mtp" to BASE.path("media/java/"),
    "android.net.rtp" to VOIP.path("src/java/"),
    "android.net.sip" to VOIP.path("src/java/"),
    "android.net.wifi" to BASE.path("wifi/java/"),
    "android.opengl" to BASE.path("opengl/java/"),
    "android.provider.Telephony" to BASE.path("telephony/java/"),
    "android.sax" to BASE.path("sax/java/"),
    "android.service.media" to BASE.path("media/java/"),
    "android.service.media.CameraPrewarmService" to BASE.path("core/java/"),
    "android.telecom" to BASE.path("telecomm/java/"),

    "android.telephony" to BASE.path("telephony/java/"),
    "android.telephony.gsm.SmsManager" to TELEPHONY.path("src/java/"),
    "android.telephony.gsm.SmsMessage" to TELEPHONY.path("src/java/"),

    "android.support.animation" to SUPPORT.path("dynamic-animation/src/main/java/"),
    "android.support.annotation" to SUPPORT.path("annotations/src/main/java/"),
    "android.support.app.recommendation" to SUPPORT.path("recommendation/src/main/java/"),
    "android.support.content" to SUPPORT.path("content/src/main/java/"),
    "android.support.constraint" to CONSTRAINT_LAYOUT.path("constraintlayout/src/main/java/").branch("studio-master-dev"),
    "android.support.customtabs" to SUPPORT.path("customtabs/src/main/java/"),
    "android.support.design" to SUPPORT.path("design/src/"),

    "android.support.graphics.drawable" to SUPPORT.path("graphics/drawable/static/src/main/java/"),
    "android.support.graphics.drawable.Animatable2Compat" to SUPPORT.path("graphics/drawable/animated/src/main/java/"),
    "android.support.graphics.drawable.AnimatedVectorDrawableCompat" to SUPPORT.path("graphics/drawable/animated/src/main/java/"),

    "android.support.multidex" to MULTIDEX.path("library/src/"),
    "android.support.media" to SUPPORT.path("exifinterface/src/main/java/"),
    "android.support.media.tv" to SUPPORT.path("tv-provider/src/main/java/"),
    // TODO remove once https://issuetracker.google.com/issues/71558096 is fixed
    "android.support.mediacompat.testlib" to SUPPORT.path("media-compat-test-lib/src/main/java/"),
    "android.support.percent" to SUPPORT.path("percent/src/main/java/"),

    "android.support.test" to TESTING.path("runner/src/main/java/").branch("android-support-test"),
    "android.support.test.annotation.UiThreadTest" to TESTING.path("rules/src/main/java/").branch("android-support-test"),
    "android.support.test.espresso" to TESTING.path("espresso/core/src/main/java/").branch("android-support-test"),
    "android.support.test.espresso.IdlingResource" to TESTING.path("espresso/idling-resource/src/main/java/").branch("android-support-test"),
    "android.support.test.espresso.contrib" to TESTING.path("espresso/contrib/src/main/java/").branch("android-support-test"),
    "android.support.test.espresso.intent" to TESTING.path("espresso/intents/src/main/java/").branch("android-support-test"),
    "android.support.test.espresso.web" to TESTING.path("espresso/web/src/main/java/").branch("android-support-test"),
    "android.support.test.rule" to TESTING.path("rules/src/main/java/").branch("android-support-test"),
    "android.support.test.uiautomator" to UI_AUTOMATOR.path("src/main/java/").branch("android-support-test"),

    "android.support.text.emoji" to SUPPORT.path("emoji/core/src/main/java/"),
    "android.support.text.emoji.bundled" to SUPPORT.path("emoji/bundled/src/main/java/"),
    "android.support.text.emoji.widget.EmojiAppCompatButton" to SUPPORT.path("emoji/appcompat/src/main/java/"),
    "android.support.text.emoji.widget.EmojiAppCompatEditText" to SUPPORT.path("emoji/appcompat/src/main/java/"),
    "android.support.text.emoji.widget.EmojiAppCompatTextView" to SUPPORT.path("emoji/appcompat/src/main/java/"),

    "android.support.transition" to SUPPORT.path("transition/src/"),

    "android.support.v4" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.app.ActionBarDrawerToggle" to SUPPORT.path("core-ui/src/main/java/"),
    "android.support.v4.app.AppLaunchChecker" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.app.DialogFragment" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.Fragment" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentActivity" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentContainer" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentController" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentHostCallback" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentManager" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentManagerNonConfig" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentPagerAdapter" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentStatePagerAdapter" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentTabHost" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FragmentTransaction" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.FrameMetricsAggregator" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.app.ListFragment" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.NavUtils" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.app.LoaderManager" to SUPPORT.path("fragment/src/main/java/"),
    "android.support.v4.app.TaskStackBuilder" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.content" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.content.ContentResolverCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content.ContextCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content.IntentCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content.SharedPreferencesCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content.pm" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content.res" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.graphics" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.graphics.ColorUtils" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.graphics.drawable.RoundedBitmapDrawable" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.math" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.media" to SUPPORT.path("media-compat/java/"),
    "android.support.v4.print" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.provider" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.provider.FontRequest" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.provider.FontsContractCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view" to SUPPORT.path("core-ui/src/main/java/"),
    "android.support.v4.view.AccessibilityDelegateCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ActionProvider" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.GestureDetectorCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.GravityCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.InputDeviceCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.LayoutInflaterCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.LayoutInflaterFactory" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.MarginLayoutParamsCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.MenuCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.MenuItemCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.MotionEventCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.NestedScrollingChild" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.NestedScrollingChild2" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.NestedScrollingParent" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.NestedScrollingParent2" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.OnApplyWindowInsetsListener" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.PointerIconCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ScaleGestureDetectorCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ScrollingView" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.TintableBackgroundView" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.VelocityTrackerCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewConfigurationCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewGroupCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewParentCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewPropertyAnimatorCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewPropertyAnimatorListener" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewPropertyAnimatorListenerAdapter" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.ViewPropertyAnimatorUpdateListener" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.WindowCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.WindowInsetsCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.animation.PathInterpolatorCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.view.accessibility" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget" to SUPPORT.path("core-ui/src/main/java/"),
    "android.support.v4.widget.CompoundButtonCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.EdgeEffectCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.ImageViewCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.ListPopupWindowCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.ListViewCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.PopupMenuCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.PopupWindowCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.ScrollerCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.TextViewCompat" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.widget.TintableCompoundButton" to SUPPORT.path("compat/src/main/java/"),

    "android.support.v7" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v7.app" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.app.MediaRouteActionProvider" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteButton" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteChooserDialog" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteChooserDialogFragment" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteControllerDialog" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteControllerDialogFragment" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteDialogFactory" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.app.MediaRouteDiscoveryFragment" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.content.res" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.graphics" to SUPPORT.path("v7/palette/src/main/java/"),
    "android.support.v7.graphics.drawable" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.media" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.preference" to SUPPORT.path("v7/preference/src/main/java/"),
    "android.support.v7.recyclerview.extensions" to SUPPORT.path("paging/runtime/src/main/java/"),
    "android.support.v7.util" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.view" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.widget" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.widget.CardView" to SUPPORT.path("v7/cardview/src/main/java/"),
    "android.support.v7.widget.DefaultItemAnimator" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.DividerItemDecoration" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.GridLayout" to SUPPORT.path("v7/gridlayout/src/main/java/"),
    "android.support.v7.widget.GridLayoutManager" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.LinearLayoutManager" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.LinearSmoothScroller" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.LinearSnapHelper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.OrientationHelper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.PagerSnapHelper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.RecyclerView" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.RecyclerViewAccessibilityDelegate" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.SnapHelper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.SimpleItemAnimator" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.StaggeredGridLayoutManager" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.helper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.util" to SUPPORT.path("v7/recyclerview/src/main/java/"),

    "android.support.v8.renderscript" to SUPPORT.path("v8/renderscript/java/src/"),

    "android.support.v13" to SUPPORT.path("v13/java/"),

    "android.support.v14.preference" to SUPPORT.path("v14/preference/src/main/java/"),
    "android.support.v17.leanback" to SUPPORT.path("v17/leanback/src/"),
    "android.support.v17.preference" to SUPPORT.path("v17/preference-leanback/src/"),

    "android.support.wear" to SUPPORT.path("wear/src/main/java/"),

    "android.test" to BASE.path("test-runner/src/"),
    "android.test.AndroidTestCase" to BASE.path("legacy-test/src/"),
    "android.test.FlakyTest" to BASE.path("legacy-test/src/"),
    "android.test.InstrumentationTestCase" to BASE.path("legacy-test/src/"),
    "android.test.InstrumentationTestSuite" to BASE.path("legacy-test/src/"),
    "android.test.PerformanceTestCase" to BASE.path("legacy-test/src/"),
    "android.test.UiThreadTest" to BASE.path("legacy-test/src/"),
    "android.test.mock" to BASE.path("test-mock/src/"),
    "android.test.suitebuilder" to BASE.path("legacy-test/src/"),
    "android.test.suitebuilder.TestMethod" to BASE.path("test-runner/src/"),
    "android.test.suitebuilder.TestSuiteBuilder" to BASE.path("test-runner/src/"),

    "android.view.PixelCopy" to BASE.path("graphics/java/"),

    "dalvik" to LIBCORE.path("dalvik/src/main/java/"),

    "java" to LIBCORE.path("ojluni/src/main/java/"),
    "java.math" to LIBCORE.path("luni/src/main/java/"),

    "javax" to LIBCORE.path("ojluni/src/main/java/"),
    "javax.microedition" to BASE.path("opengl/java/"),
    "javax.xml" to LIBCORE.path("luni/src/main/java/"),

    "junit" to BASE.path("legacy-test/src/"),
    "junit.runner" to BASE.path("test-runner/src/"),
    "junit.textui" to BASE.path("test-runner/src/"),

    "org" to LIBCORE.path("luni/src/main/java/"),
    "org.json" to LIBCORE.path("json/src/main/java/"),
    "org.xmlpull" to LIBCORE.path("xml/src/main/java/"),
    "org.apache.http" to BASE.path("core/java/")
)
