package Tiger034

import Tiger034.buildTypes.*
import Tiger034.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger034")
    name = "Tiger034"

    vcsRoot(Tiger034_cVCSroot)

    buildType(Tiger034_Hi3)
    buildType(Tiger034_Hi2)
    buildType(Tiger034_Hi1)
    buildType(Tiger034_Hi0)
})
