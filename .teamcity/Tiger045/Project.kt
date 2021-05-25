package Tiger045

import Tiger045.buildTypes.*
import Tiger045.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger045")
    name = "Tiger045"

    vcsRoot(Tiger045_cVCSroot)

    buildType(Tiger045_Hi0)
    buildType(Tiger045_Hi1)
    buildType(Tiger045_Hi2)
    buildType(Tiger045_Hi3)
})
