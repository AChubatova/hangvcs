package Tiger0413

import Tiger0413.buildTypes.*
import Tiger0413.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0413")
    name = "Tiger0413"

    vcsRoot(Tiger0413_cVCSroot)

    buildType(Tiger0413_Hi1)
    buildType(Tiger0413_Hi2)
    buildType(Tiger0413_Hi0)
    buildType(Tiger0413_Hi3)
})
