package Tiger033

import Tiger033.buildTypes.*
import Tiger033.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger033")
    name = "Tiger033"

    vcsRoot(Tiger033_cVCSroot)

    buildType(Tiger033_Hi3)
    buildType(Tiger033_Hi2)
    buildType(Tiger033_Hi1)
    buildType(Tiger033_Hi0)
})
