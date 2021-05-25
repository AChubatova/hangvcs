package Tiger0411

import Tiger0411.buildTypes.*
import Tiger0411.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0411")
    name = "Tiger0411"

    vcsRoot(Tiger0411_cVCSroot)

    buildType(Tiger0411_Hi0)
    buildType(Tiger0411_Hi3)
    buildType(Tiger0411_Hi1)
    buildType(Tiger0411_Hi2)
})
