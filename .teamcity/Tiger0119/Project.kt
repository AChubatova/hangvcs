package Tiger0119

import Tiger0119.buildTypes.*
import Tiger0119.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0119")
    name = "Tiger0119"

    vcsRoot(Tiger0119_cVCSroot)

    buildType(Tiger0119_Hi0)
    buildType(Tiger0119_Hi1)
    buildType(Tiger0119_Hi2)
    buildType(Tiger0119_Hi3)
})
